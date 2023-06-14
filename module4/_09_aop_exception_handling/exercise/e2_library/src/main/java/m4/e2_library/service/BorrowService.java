package m4.e2_library.service;

import m4.e2_library.model.Book;
import m4.e2_library.model.Borrow;
import m4.e2_library.model.User;
import m4.e2_library.repository.BookRepository;
import m4.e2_library.repository.BorrowRepository;
import m4.e2_library.repository.UserRepository;
import org.springframework.stereotype.Service;

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

    public void borrow(Book book, User user) {
        book.setQuantity(book.getQuantity() -1);
        userRepository.save(user);
        Borrow borrow = new Borrow();
        borrow.setCode("");
        borrowRepository.save(borrow);
    }

    public void dueBack(Borrow borrow){
        Book book = borrow.getBook();
        book.setQuantity(book.getQuantity()+1);
        borrow.setBroughtDate(null);
        borrow.setStatus(true);
//        bookRepository.save()
    }


}
