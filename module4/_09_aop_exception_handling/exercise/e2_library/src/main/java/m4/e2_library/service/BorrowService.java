package m4.e2_library.service;

import m4.e2_library.model.Book;
import m4.e2_library.model.Borrow;
import m4.e2_library.model.User;
import m4.e2_library.repository.BookRepository;
import m4.e2_library.repository.BorrowRepository;
import m4.e2_library.repository.UserRepository;
import m4.e2_library.util.RandomString;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class BorrowService {
    private final BorrowRepository borrowRepository;
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    public BorrowService(BorrowRepository borrowRepository, UserRepository userRepository, BookRepository bookRepository) {
        this.borrowRepository = borrowRepository;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean borrow(Book book, User user) {
        try {
            User newUser = userRepository.save(user);

            book.setQuantity(book.getQuantity() - 1);
            bookRepository.save(book);

            Borrow borrow = new Borrow();
            borrow.setCode(RandomString.randomAlphaNumeric(5));
            borrow.setBook(book);
            borrow.setUser(newUser);
            borrow.setTakenDate(LocalDateTime.now());

            return borrowRepository.save(borrow).getId() > 0;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean dueBack(String code) {
        Optional<Borrow> borrowOptional = borrowRepository.findFirstByCode(code);

        try {
            if (borrowOptional.isPresent()) {
                Book book = borrowOptional.get().getBook();
                book.setQuantity(book.getQuantity() + 1);
                bookRepository.save(book);
                borrowOptional.get().setBroughtDate(LocalDateTime.now());

                return !borrowRepository.save(borrowOptional.get()).equals(borrowOptional.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}