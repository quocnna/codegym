package _12_java_collection_framework.exercise.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  _12_java_collection_framework.exercise.e1.AppConstant.Sort;

public class Test {
    private static Scanner scanner= new Scanner(System.in);
    private static ProductService productService= new ProductService();
    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu(){
        System.out.println("1. Create new product\n2. Edit a product\n3. Delete a product\n4. Display list product\n5. Search by name\n6. Sort by price");
        int choice= 0;
        do{
            System.out.print(choice==0? "Input your choice: ": "Please input value from 1 to 6: ");
            choice= Integer.parseInt(scanner.nextLine());
        }while (choice<=0 || choice>6);

        switch (choice){
            case 1:
                create();
                break;
            case 2:
                edit();
                break;
            case 3:
                delete();
                break;
            case 4:
                show(productService.getAll());
                break;
            case 5:
                search();
                break;
            case 6:
                sort();
                break;
        }

        backToMainMenu();
    }

    private static void backToMainMenu(){
        System.out.print("Do you back to main menu (Y/N): ");
        String answer= scanner.nextLine();
        if(answer.equalsIgnoreCase("Y"))    displayMainMenu();
        else System.exit(0);
    }

    private static void create(){
        inputAndSave(0);
        System.out.println("Created successful");
    }

    private static void edit(){
        productService.getAll().forEach(System.out::println);
        System.out.print("Please choice product id to edit: ");
        int id= Integer.parseInt(scanner.nextLine());
        inputAndSave(id);
        System.out.println("Updated successful");
    }

    private static void inputAndSave(int id){
        System.out.print("Name: ");
        String name= scanner.nextLine();
        System.out.print("Price: ");
        double price= Double.parseDouble(scanner.nextLine());
        Product product= new Product(id, name, price);
        productService.save(product);
    }

    private static void delete(){
        productService.getAll().forEach(System.out::println);
        System.out.print("Please choice product id to delete: ");
        int id= Integer.parseInt(scanner.nextLine());
        productService.delete(id);
        System.out.println("Deleted sucessful");
    }

    private static void sort(){
        System.out.print("Do you want sort by ASC or DESC? ");
        String answer= scanner.nextLine();
//        Sort sort= Sort.valueOf(answer.toUpperCase());
        productService.sortByPrice(answer.equalsIgnoreCase("desc"));
        show(productService.getAll());
    }

    private static void search(){
        System.out.print("Input name to search: ");
        String name= scanner.nextLine();
        show(productService.searchByName(name));
    }

    private static void show(List<Product> products){
        if(products.size()>0) products.forEach(System.out::println);
        else System.out.println("Empty list");
    }
}
