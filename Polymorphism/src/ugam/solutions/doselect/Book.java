package ugam.solutions.doselect;

//Write your code here
class Book {
  String title;
  String author;
  int pages;
  
  Book(String title, String author, int pages){
      this.title = title;
      
      if (author.contains(" ")){
    	  String[] tAuthor = author.split(" ");
    	  
    	  StringBuffer sb = new StringBuffer();
    	  for (int i = 0; i < tAuthor.length; i++){
    		  sb.append(tAuthor[i]);
    		  sb.append(",");
    	  }
    	  int last = sb.toString().lastIndexOf(",");
    	  this.author = sb.toString().substring(0, last);
      }
      
      this.pages = pages;
  }
  
  String getDetails(){
      return title + "-" + author;
  }
}


class Ebook extends Book {
  int appxSize;
  String format;
  
  Ebook(String title, String author, int pages, String format){
      super(title, author, pages);
      this.format = format;
      setAppxSize(pages, format);
  }
  
  void setAppxSize(int pages, String format){
      if (format.equalsIgnoreCase("mobi")){
          appxSize = 15 * pages;
      }
      if (format.equalsIgnoreCase("pdf")){
          appxSize = 10 * pages;
      }
      if (format.equalsIgnoreCase("epub")){
          appxSize = 5 * pages;
      }
  }
}

class PrintedBook extends Book {
  int available;
  double basePrice;
  double sellingPrice;
  
  PrintedBook(String title, String author, int pages, int available, double basePrice) {
      super(title, author, pages);
      this.available = available;
      this.basePrice = basePrice;
      setSellingPrice(available, basePrice);
  }
  
  void setSellingPrice(int available, double basePrice) {
      double tax = basePrice * 0.05;
      if((available <= 1000) && (available >= 0)){
          sellingPrice = tax + (available * 0.02) + basePrice;
      }
      if(available > 1000){
          sellingPrice = tax + (1000 * 0.02) + basePrice;
      }
  }
  
  void buy(){
      if (available > 1) {
          available = available - 1;
      }
      setSellingPrice(available, basePrice);
  }
}
