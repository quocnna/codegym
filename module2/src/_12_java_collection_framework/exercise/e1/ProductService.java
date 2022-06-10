package _12_java_collection_framework.exercise.e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
  private ArrayList<Product> products = new ArrayList<>();

  void save(Product product) {
    if (product.getId() > 0) {
      int index = products.indexOf(product);
      products.set(index, product);
    } else {
      int lastId = 0;
      if (products.size() > 0) {
        lastId = products.get(products.size() - 1).getId();
      }

      product.setId(lastId + 1);
      products.add(product);
    }
  }

  List<Product> getAll() {
    return products;
  }

  void delete(int id) {
    //        int size= products.size();
    //        for (int i = 0; i < size; i++) {
    //            if(id== products.get(i).getId()){
    //                products.remove(i);
    //                break;
    //            }
    //        }

    products.removeIf(e -> e.getId() == id);
  }

  List<Product> searchByName(String name) {
    return products.stream().filter(e -> name.equals(e.getName())).collect(Collectors.toList());
  }

  void sortByPrice(boolean isDESC) {
    if (isDESC) {
      Collections.sort(
          products,
          isDESC
              ? Comparator.comparing(Product::getPrice).reversed()
              : Comparator.comparing(Product::getPrice));
    }
  }
}
