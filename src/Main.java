import com.company.models.Comments;
import com.company.models.Customer;
import com.company.models.Posts;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
           Comments comment1 = new Comments("Its Delicious");
           Comments comment2 = new Comments( "Its the best place to learn the technologies");
           Comments comment3 = new Comments("Nice Place ");
           Comments comment4 = new Comments("its an beautiful location to prepare and work ");
           Comments comment5 = new Comments("");
           List<Comments> comment_a= Arrays.asList(comment1, comment2, comment5);
           List<Comments> comments_b=Arrays.asList(comment1,comment3);
           List<Comments> comments_c=Arrays.asList(comment5,comment1,comment3);
           List<Comments> comments_d=Arrays.asList(comment1,comment2,comment3,comment4,comment5);
           List<Comments> comments_e=Arrays.asList(comment1,comment5);
           //List comments_x =Arrays.asList(comment_a,comments_b);
           Posts post1= new Posts("p1","Vemula@gmail.com","H1","About Organisation",comment_a);
           Posts post2= new Posts("p2","sai@gmail.com","H2","About Food",comments_b);
           Posts post3= new Posts("p3","Srinivas@gmail.com","H2","About Organisation ",comments_c);
           Posts post4= new Posts("p4","kiran@gmail.com","H3","About Work ",comments_d);
           Posts post5= new Posts("p5","kiran@gmail.com","H3","About Work ",comments_e);

        List<Customer> Customers  = new ArrayList<>();
        {
            Customer c1 = new Customer("vemula", post1);
            Customer c2 = new Customer("sai", post2);
            Customer c3 = new Customer("Kiran", post3);
            Customer c4 = new Customer("Srinivas",post4);
            Customer c5 = new Customer("Srinivas",post5);

            Customers.add(c1);
            Customers.add(c2);
            Customers.add(c3);
            Customers.add(c4);
            Customers.add(c5);

        }
        System.out.println("Task 1");
        Customers.stream().forEach(x->{
            System.out.println("Customer name: "+x.getName()+"\nEmailId-"+x.getNewPosts().getEmail()+"\n");
        });
        System.out.println("Task 2");

        Customers.stream().forEach(x-> {
            System.out.println("Customer Name :"+x.getName()+"; Heading :"+x.getNewPosts().getHeading()+"; Description :"+x.getNewPosts().getDescription());
        });
        System.out.println("Task 3");
        Customers.stream().forEach(result->{
                    System.out.println("Customer Name : "+result.getName()+"\nHeading : "+result.getNewPosts().getHeading()+"\nDescription : "+result.getNewPosts().getDescription()
                            +"\n");
                    result.getNewPosts().getComment().stream().forEach(x->System.out.println("Comment :"+x.getComment()));

                }


        );





//
//
//        System.out.println(" Task 2");
//        //System.out.println("   \n   ");
//        System.out.println("Customer Details");
//        System.out.println("");
//        System.out.println("******\nWithout Streams\n****** ");
//        System.out.println("");
//        for (Customer C : Customers) {
//
//            System.out.println("Email :"+C.getNewPosts()+"; \nName:"+C.getName());
//        }
//        System.out.println("");
//        System.out.println("******\nWith Streams\n****** ");
//        System.out.println("");
//
//        Customers.stream().forEach(Cust->System.out.println("Name: "+ Cust.getName()+"\nEmailId: "+Cust.getNewPosts()));
//
//        //Customers.forEach(Cus -> System.out.println("Customer Name : "+Cus.getName()+"\nCustomer EmailID : "+Cus.getEmail()));
//        System.out.println("");
//        System.out.println("Task 3");
//        System.out.println("");
//        for (int i = 0; i< Comment.size(); i++)
//
//        {
//            System.out.println(Customers);
//
//        }
        //for()
//        System.out.println("");
//        System.out.println("******\nWithout Streams\n****** ");
//        System.out.println("");
//        for (Customer C : Customers) {
//            for (Posts p : Post) {
////                if(C.getEmail()== p.getEmail()){
////                    System.out.println(C.getName()+p.getEmail()+p.getDescription());
////                }
//                boolean cond = C.getEmail().equals(p.getEmail());
//                if(cond==true) {
//                    System.out.println("Customer Name : " + C.getName() + "; \n" + "Heading : " + p.getHeading() + "; \n" + "Description : " + p.getDescription() + "; \n");
//                }
//            }
//        }




//        System.out.println("");
//        System.out.println("******\nWith Streams\n****** ");
//        System.out.println("");
//        Customers.stream().forEach(customer1 -> {
//            Post.stream().filter(p -> p.getEmail()==customer1.getEmail())
//                    .forEach(f -> System.out.println("Customer Name : " + customer1.getName()+"; \n" + "Heading : " +f.getHeading()+"; \n" + "Description : " +f.getDescription()+"; \n"));
//            });
//        System.out.println("");
//        System.out.println("Task 4");
//        System.out.println("");
//        System.out.println("******\nWithout Streams\n****** ");
//        System.out.println("");
//        for (Comments Comm : Comment) {
//            for (Customer cus : Customers)
//            {
//                for (Posts pos: Post) {
//
//                    boolean condition1 = (pos.getPostID().equals(Comm.getPostID())) && (pos.getEmail().equals(cus.getEmail()));
//
//                    if(condition1 == true)
//                    {
//                        System.out.println(" Name : "+cus.getName()+";\n Heading : "+pos.getHeading()+";\n Description : "+ pos.getDescription()+";\n Comment : "+ Comm.getComment()+"; ");
//                    }
//
////                    if (Comm.getComment()==null)
////                    {
////                        System.out.println("the people who not gave any comment "+ cus.getName() +";"+cus.getEmail()+";"+pos.getHeading()+";"+pos.getDescription());
////                    }
//                }
//
//
//
//            }
//
//
//            System.out.println();
//
//           // System.out.println("Email :"+C.getEmail()+"; Name:"+C.getName());
//        }
//        System.out.println("");
//        System.out.println("******\nWith Streams\n****** ");
//        System.out.println("");
//
//        Comment.stream().forEach((Comm -> {
//            Post.stream().forEach(pos ->
//                Customers.stream().filter(f -> Comm.getPostID() == pos.getPostID() && pos.getEmail() == f.getEmail()).
//                        forEach(p -> System.out.println("Customer Name : " + p.getName()+"; \nHeading : " + pos.getHeading() +"; \nDescription : " +
//                                pos.getDescription() + "; \nComment : " + Comm.getComment() +"\n")));
//
//
//
//        }));


//        System.out.println("   \n   ");
//        System.out.println("Task 2");
//        System.out.println("Post Details");
//        for (Posts p: Post) {
//            System.out.println("Post Id : "+ p.getPostID()+"  E mail Id :"+p.getEmail()+"  Heading :"+p.getHeading()+"  Description : "+p.getDescription());
//
//        }
//        System.out.println("   \n   ");
//        System.out.println("Comment Details");
//
//        for (Comments com : Comment ) {
//
//            System.out.println("Post Id: "+ com.getPostID()+"  Email ID: " +com.getEmail()+"  Comment: "+com.getComment());
//        }



    }
}
