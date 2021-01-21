package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {

    private int id = 0;
    private String title = "";
    private String publishdate = "";
    private String author = "";
    private String content = "";
    private float averagerate = 0;
    private int[] rateList = new int[3];
    public static ArrayList LIST = new ArrayList();

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishdate;
    }

    public void setPublishDate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getAverageRate() {
        return averagerate;
    }

    @Override
    public void display() {
        System.out.println(" ID :" + id);
        System.out.println(" title :" + title);
        System.out.println(" publishDate :" + publishdate);
        System.out.println(" author :" + author);
        System.out.println(" content :" + content);
        System.out.println(" averageRate :" + averagerate);
    }

    public void calculate() {
        int s = 0;
        for (int i = 0; i < 2; i++) {
            s = s + rateList[i];
            averagerate = s / 3;
        }
    }

    public static void main(String[] args) {
        News news = new News();
        System.out.println("1 - Insert news  :");
        System.out.println("2 – View list news :");
        System.out.println("3 – Average rate ");
        System.out.println("4 – Exit  ");
        Scanner s = new Scanner(System.in);
        int select = s.nextInt();
        switch (select) {
            case 1:
                System.out.println(" Id input: ");
                int inputid = s.nextInt();
                news.setID(inputid);
                LIST.add(inputid);

                System.out.println(" Title input: ");
                String inputtitle = s.nextLine();
                news.setTitle(inputtitle);
                LIST.add(inputtitle);

                System.out.println(" PublishDate input: ");
                String inputpublishDate = s.nextLine();
                news.setPublishDate(inputpublishDate);
                LIST.add(inputpublishDate);

                System.out.println(" Author input: ");
                String inputauthor = s.nextLine();
                news.setAuthor(inputauthor);
                LIST.add(inputauthor);

                System.out.println(" Content input: ");
                String inputcontent = s.nextLine();
                news.setContent(inputcontent);
                LIST.add(inputcontent);

                System.out.println(" Nhap danh gia: ");
                for (int i = 0; i < 2; i++) {
                    news.rateList[i] = s.nextInt();
                }
                break;
                
            case 2:
                news.display();
                break;
                
            case 3:
                news.calculate();
                news.display();
                break;
                
            default:
                System.exit(0);
        }
    }
}
