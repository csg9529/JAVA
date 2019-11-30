
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



class Computer {

		 
		
		 public String soket = "0";
		public String Name="";
		public int Price=0;
		public String comp ="";
		public String Mf ="";
		public static String[] A= new String[]{"(1)  메인보드" , "  (2)  CPU", "  (3) 그래픽 카드 "
				,"  (4) Ram","  (5)  SSD","  (6)  HDD","  (7)  Power ","  (8)  견적완료"};
		
	 
		@Override
		public String toString() {
			return "Computer [soket=" + soket + ", Name=" + Name + ", Price=" + Price + ", comp=" + comp + ", Mf=" + Mf
					+ "]";
		}
		public int sum(int[] a){
			int sum=0;
			for(int i = 0 ; i<a.length;i++){
				sum+=a[i];
			}
			return sum;
		}
	 
	 
		public void itemChoose(){
			
			/*이 메소드는 하드웨어 종류를 담은 배열 중에서 한 원소를 제외한 
			 * 나머지 원소들을 출력하는 메소드*/
			
			for(int i =0 ;i<A.length ; i++){
			
				System.out.print(A[i]);	
			}
			 System.out.println();
		}
		
	 
		
		
	}



class Cpu extends Computer{
	 
	public Cpu(String a,int b){
		Name=a;
		Price =b;
			
	}
 
	public Cpu() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public void name(String a){
		Name=a;		
	}
	public void price(int a){
		Price=a;		
	}
	public void comp(String a){
		comp=a;		
	}
	public void Mf(String a){
		Mf=a;		
	}
 
	@Override
	public String toString() {
		return "Cpu [ 부품명  : " + Name + ", 가격  : " + Price + ", 호환성 : " + comp + ", 제조사 : " + Mf + "]";
		}
 
}
 
 
 
 
 
 
 

 
class MainBoard  extends Computer{
 
 
	public MainBoard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void name(String a){
		Name=a;		
	}
	public void price(int a){
		Price=a;		
	}
	public void comp(String a){
		comp=a;		
	}
	public void Mf(String a){
		Mf=a;		
	}
	public void Soket(String a){
		soket = a;
	}
 
	@Override
	public String toString() {
		return "MainBoard [ 부품명 :  " + Name + ", 가격 : " + Price + ", 호환성 : " + comp + ", 제조사 : " + Mf+" ,램소켓 개수 : " + soket
				+ "]";
	}
 
	
}


	

 

 
class GraphicCard  extends Computer{
	
	public GraphicCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void name(String a){
		Name=a;		
	}
	public void price(int a){
		Price=a;		
	}
	public void Mf(String a){
		Mf=a;		
	}
 
	@Override
	public String toString() {
		return "GraphicCard [ 부품명  : " + Name + ", 가격  : " + Price +  ", 제조사 : " + Mf + "]";
		}
 
}
 
 
 

 
class Power extends Computer{
	public void name(String a){
		Name=a;		
	}
	public void price(int a){
		Price=a;		
	}
	public void comp(String a){
		comp=a;		
	}
	public void Mf(String a){
		Mf=a;		
	}
 
	@Override
	public String toString() {
		return "Power [ 부품명  : " + Name + ", 가격  : " + Price +  ", 제조사 : " + Mf + "]";
		}
}








class SSD extends Computer{
	public void name(String a){
		Name=a;		
	}
	public void price(int a){
		Price=a;		
	}
	
	public void Mf(String a){
		Mf=a;		
	}

	@Override
	public String toString() {
		return "SSD [ 부품명  : " + Name + ", 가격  : " + Price +  ", 제조사 : " + Mf + "]";
		}
}





class HDD extends Computer{
	public void name(String a){
		Name=a;		
	}
	public void price(int a){
		Price=a;		
	}
	
	public void Mf(String a){
		Mf=a;		
	}

	@Override
	public String toString() {
		return "HDD [ 부품명  : " + Name + ", 가격  : " + Price +  ", 제조사 : " + Mf + "]";
		}
}







class Ram extends Computer{
	public void name(String a){
		Name=a;		
	}
	public void price(int a){
		Price=a;		
	}
	public void comp(String a){
		comp=a;		
	}
	public void Mf(String a){
		Mf=a;		
	}

	@Override
	public String toString() {
		return "Ram [ 부품명  : " + Name + ", 가격  : " + Price +  ", 제조사 : " + Mf + "]";
		}
}



 
 
public class Main  {
	
	public static void main(String[] asdf) throws IOException{
		int ramPrice=0;
		int overPrice = 10000;
		int socketNum =0;	//메인보드에 꼽을수잇는 램 갯수
		String brick="ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"; //칸막이
		String[] rams = null ;		//램 여러개/
		String[] chosenName = new String[8];	//최종 선택한것들
		int[] chosenPrice = new int[8];			//가격들
		for(int i =0 ; i<8;i++)
		{
			chosenName[i]="선택 없음";               //선택한 부품명을 저장하는 배열에 "선택 없음"으로 변수 초기화
			chosenPrice[i]=0;                    // 선택한 부품가격을 저장하는 배열에 0값으로 변수 초기화 
      
		}
		
		int device = 0;
		Computer com = new Computer();                        
		StringBuffer buffer = new StringBuffer();
		/*
		하드웨어의 갯수에 따라 배열을 선언한다.
		그리고 하드웨어 제품들을 배열의 원소로 선언한다.*/
		
		ArrayList<Computer[]> list = new ArrayList<Computer[]>(); // 다형성 구현한 ArrayList	
		MainBoard[] mb = new MainBoard[12];
		Cpu[] cpu = new Cpu[15];	
		GraphicCard[] gc = new GraphicCard[10];
		Ram[] rm = new Ram[10];
		SSD[] sd = new SSD[18];
		HDD[] hd = new HDD[12];
	    Power[] pw = new Power[10];
		 list.add(mb);                                        //부품들의 클래스들을 ArrayList에 저장
		 list.add(cpu);
		 list.add(gc);
		 list.add(rm);
		 list.add(sd);
		 list.add(hd);
		 list.add(pw);
		 
		 File file = new File("c:\\java\\computer.txt");   //컴퓨터 부품정보를 메모장에서 불러오기
		 File file2 = new File("c:\\java\\comim.txt");     // 컴퓨터맞추기 기본지식을  메모장에서 불러오기
 
 
			Scanner sc = new Scanner(file);
			Scanner sc2 = new Scanner(file2);
			
			for(int i = 0; i<cpu.length;i++){			
				cpu[i] = new Cpu();
				cpu[i].name(sc.next());
				cpu[i].price(sc.nextInt());
				cpu[i].Mf(sc.next());
				cpu[i].comp(sc.next());
				
			}
			for(int i = 0; i<mb.length;i++){
				mb[i] = new MainBoard();
				mb[i].name(sc.next());
				mb[i].price(sc.nextInt());
				mb[i].Mf(sc.next());
				mb[i].comp(sc.next());
				mb[i].Soket(sc.next());
			}
			for(int i = 0;i<gc.length;i++){
				gc[i] = new GraphicCard();
				gc[i].name(sc.next());
				gc[i].price(sc.nextInt());
				gc[i].Mf(sc.next());
			}
			for(int i = 0;i<rm.length;i++){
				rm[i] = new Ram();
				rm[i].name(sc.next());
				rm[i].price(sc.nextInt());
				rm[i].Mf(sc.next());
			}
			for(int i = 0;i<sd.length;i++){
				sd[i] = new SSD();
				sd[i].name(sc.next());
				sd[i].price(sc.nextInt());
				sd[i].Mf(sc.next());
			}
			for(int i = 0;i<hd.length;i++){
				hd[i] = new HDD();
				hd[i].name(sc.next());
				hd[i].price(sc.nextInt());
				hd[i].Mf(sc.next());
			}
			for(int i = 0;i<pw.length;i++){
				pw[i] = new Power();
				pw[i].name(sc.next());
				pw[i].price(sc.nextInt());
				pw[i].Mf(sc.next());
			}
			sc.close();
	
		
		System.out.println(" ************************************************************");
		System.out.println("                      조립식 컴퓨터의 안내견                  ");
   	   	System.out.println(" ************************************************************");
   	   	System.out.println("환영합니다. 저희 프로그램은 조립식 컴퓨터에 대한 정보 및 맞춤 견적을 제공합니다.");
   	   	System.out.println(brick);
   	   	System.out.println("  ① 견적 맞추기    ② 부품 전체 보기   ③ 견적을 맞추기 전 안내서");
   	   	System.out.println(brick);
		
		Scanner scan  = new Scanner(System.in);
		
		/*//1. 견적맞추기  , 2.부품전체보기  , 3.견적맞추기 전 안내서  中 하나를 선택한다.
*/		
		boolean check = true;	
		while(check){
		System.out.println("원하시는 기능을 선택해주세요");
		System.out.println(brick);
		int n;
		do{                                             // do while 문으로 선택 받기
		 n = scan.nextInt();		//맨 첫화면 선택
		 if(!(n<4&&n>0))System.out.println("잘 못 입력하셨습니다.");
			System.out.println(brick);
		}while(!(n<4&&n>0));
		
		
		/*부품 설명 보기 and 설명서 보기 이후 다시 시작*/
		a:
			
		switch(n){
		
		
		/*itemchoose 메소드는 매개변수로 숫자를 입력 받는다.
		 * 그 숫자는 하드웨어 종류 배열에서 숫자에 해당하는 인덱스의 원소를 제외한 나머지
		 * 원소들을 콘솔창에 출력하는 메소드이다.
		 * 즉 아래처럼 itemchoose(1)는 하드웨어 배열에서 1번 인덱스의 원소를
		 * 제외한 나머지 원소들을 출력한다.*/
		case 1: com.itemChoose();
			break;
		case 2: 
			for(int i =0;i< mb.length;i++)System.out.println(mb[i].toString());			  //2번을 선택할경우 모든 부품정보를 보여준다.
			for(int i =0;i< cpu.length;i++)System.out.println(cpu[i].toString());
			for(int i =0;i< gc.length;i++)System.out.println(gc[i].toString());
			for(int i =0;i< rm.length;i++)System.out.println(rm[i].toString());
			for(int i =0;i< sd.length;i++)System.out.println(sd[i].toString());
			for(int i =0;i< hd.length;i++)System.out.println(hd[i].toString());
			for(int i =0;i< pw.length;i++)System.out.println(pw[i].toString());
			break a;
		case 3: while(sc2.hasNext()){                           //3번을 선택할경우 comim.txt 에있는 컴퓨터 맞치기 정보를 보여준다.
			System.out.println(sc2.nextLine());
		}sc2.close();
			break a;
		
		}
		
		//1번 견적맞추기 기능을 선택한다면 무한 루프로 진입한다.
		
		if(n == 1){
			
			while(true){
				
		//파일의 데이터를 cpu , mb , cg 에 저장한다.
				
				/*cpu , 메인보드 , 그래픽카드 객체에 자료 저장*/
		
				/*메인보드 , cpu , 그래픽카드 .... 중에서 하나 선택*/
				do{                                              // do while 문으로 선택 받기
				device = scan.nextInt();	//device = 부품
				if(!(device<9&&device>0))System.out.println("다시 입력 해 주세요.");
				System.out.println(brick);
				}while(!(device<9&&device>0));
				/*메인보드 설정 이전에 ram을 선택한 경우*/
				
				
				
				 if(device==8){		//8번 최종견적
		    		   System.out.println("최종견적");
		    		   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		    		   System.out.println("     메인보드  : "+chosenName[0]+" /CPU : "+chosenName[1]+" /그래픽카드 : "+chosenName[2]+" /RAM : "+chosenName[3]+
				                "/           \n     SSD : "+chosenName[4]+"/HDD : "+chosenName[5]+"/POWER : "+chosenName[6]+" /합산 가격 : "+com.sum(chosenPrice)+"원                     ");
		               System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");    	       
		               check=false;
		               break;
		    	   }
				 
				
				if(device == 4 &&chosenName[0].equals("선택 없음")){		//메인보드를 선택하지않고 램을 선택할시 경고메세지 출력 및 재선택
					System.out.println("메인보드를 먼저 선택해주세요. 왜냐하면 메인보드의 소켓 숫자와 램의 호환를 고려해야합니다.");
					System.out.println(brick);
					com.itemChoose();
					continue;
				}
				
				
				
				
				
				//
				if(device == 4 &&!chosenName[0].equals("선택 없음")){
					int ramNum=0;
					int limitRam=0;
					System.out.println("희망가격을 입력해주세요.");
					System.out.println(brick);
					int money4;
					do {                                       // do while 문으로 선택 받기
					 money4 = scan.nextInt();
					 if(money4<rm[0].Price)System.out.println("가격이 너무 낮습니다.");
						System.out.println(brick);
					}while(money4<rm[0].Price);
					for(int i=0; i< list.get(device-1).length ; i++){
			    		   
			    		   if(list.get(device-1)[i].Price>money4){
			    			   overPrice = i-1;                              // overPrice 란 ? 어느 가격대의 어떤부품 부터 제외된지 알기위한 인덱스 정보
			    			   break;}
			    		   else overPrice = i;
			    		   
			    	   System.out.println(i+1+" : "+list.get(device-1)[i].toString());
			   		System.out.println("");
 
					
			    	   }
					System.out.println(brick);
					
					
					 System.out.println("주어진 "+com.A[device-1].split(" ")[1]+" 중에서 " +socketNum+ "개 이하의 ram을 선택하세요.");
				   		System.out.println("");
				   		System.out.println("구매하고자 하는 RAM의 갯수를 결정하세요.");
				   		System.out.println(brick);
				   		do{
				   		limitRam = scan.nextInt();                     //메인보드의 소켓 수 보다 많이 선택한경우 재선택 
				   		if(limitRam>socketNum)System.out.println("메인보드에 주어진 램소켓보다 많습니다. 다시 선택해주세요.");
				   		System.out.println(brick);
				   		
				   		}while(limitRam>socketNum);
					for(int i = 0; i < limitRam ;i++){
						System.out.print((i+1)+"번째    :  ");
						ramNum = scan.nextInt();
						System.out.println(brick);
						
						if(ramNum>overPrice+1||ramNum<=0)                   // OverPrice 를 이용항 선택시 기준을 잡음
					    	  
			    	    {
			    	    	System.out.println("주어진 "+com.A[device-1].split(" ")[1]+
			    			  "의 범위가 아닙니다. 다시 선택하세요.");
			    	    	System.out.println(brick);
			    	  
			    	  
			    	  
			    	  
			    	  //희망 가격 범위 내의 부품들을 다시 출력한다.
			    	    	for(int j=0; j< list.get(device-1).length ; j++){
			   		  
			    	    		if(list.get(device-1)[j].Price>money4){
			    	    			break;}
			   		   
			    	    		System.out.println(j+1+" : "+list.get(device-1)[j].toString());
			    	    		System.out.println("");
                              
					
			    	    	}
			    	    	i--;
			    	    	System.out.println(brick);
 
			  		
			    	    }
			    	    
			    	    
			    	    else if(ramNum<=overPrice+1) {
			    	    	
			    	    	check = false;
						;
						
						ramPrice+= list.get(3)[ramNum-1].Price;      //가격을 저장
						rams[i] = list.get(3)[ramNum-1].Name;       // 이름을 저장
						chosenPrice[3]=ramPrice;                      
			    	    }
						
					}
					ramPrice=0;                          //램의 가격을 저장하는 임시공간을 다시 0으로 초기화
					
					for(int i =0 ;i<limitRam ; i++)buffer.append(rams[i]);               //ram배열에 저장된 정보를 버퍼로 확장
					
			   		
 
			   		
			   		chosenName[3] = Arrays.toString(rams);           //여러개의 램을 한꺼번에 chosenName의 램 부분에 저장
			   	   System.out.println("메인보드  : "+chosenName[0]+" /CPU : "+chosenName[1]+" /그래픽카드 : "+chosenName[2]+" /RAM : "+chosenName[3]+
			                "/\nSSD : "+chosenName[4]+"/HDD : "+chosenName[5]+"/POWER : "+chosenName[6]+" /합산 가격 : "+com.sum(chosenPrice)+"원");
           	   
             	   System.out.println(brick);
             	  
			   		System.out.println("또 다른 하드웨어를 선택하세요.");
			   		System.out.println(brick);
			   		com.itemChoose();
			   		continue;
				}//if(device == 4 &&!chosenName[0].equals("선택 없음"))
				
				
		System.out.println("희망가격을 입력해주세요");
		System.out.println(brick);
        overPrice =0;
		int money;
		do{
		 money = scan.nextInt();		
		 if(money < list.get(device-1)[0].Price){
			 System.out.println("가격이 낮습니다 다시 해주세요");
		 System.out.println(brick);
		 }
		 
		 
		}while(money < list.get(device-1)[0].Price);
		
	/*list 는 하드웨어의 종류들을 담은 배열이고 (cpu , mainboard , memory ....), 
	 * list.get(chosenHard) 는 선택된 하드웨어의 배열이다.(cpu 1 , cpu 2 , cpu 3 , cpu 4.....)*/
    	   for(int i=0; i< list.get(device-1).length ; i++){
    		   
    		   if(list.get(device-1)[i].Price>money){
    			   overPrice = i-1;
    			   break;
    			   }
    		   overPrice =i;

    	   System.out.println(i+1+" : "+list.get(device-1)[i].toString());
   		System.out.println("");
 
		
    	   }
    		System.out.println(brick);
    	   
    	   
    	   
    	  
    	    
    	   System.out.println(" 주어진 "+com.A[device-1].split(" ")[1]+" 중 하나를 선택하세요");
    		System.out.println(brick);
// index + 1
   		int z = 0 ;
   		check = true;
    	   while(check)
    	   {
    			   
    	   z = scan.nextInt();
    	   
    	   
    	   //램 선택 시 , 메인보드의 소켓 수를 고려해야한다.
    	  
    	  
    		  //희망 가격보다 높은 가격의 부품을 선택한 경우
    	    if(z>overPrice+1||z<=0)
    	  
    	    {
    	    	System.out.println(" 주어진 "+com.A[device-1].split(" ")[1]+
    			  "의 범위가 아닙니다. 다시 선택하세요");
    	    	System.out.println(brick);
    	  
    	  
    	  //희망 가격 범위 내의 부품들을 다시 출력한다.
    	    	for(int i=0; i< list.get(device-1).length ; i++){
   		  
    	    		if(list.get(device-1)[i].Price>money){
    	    			break;}
   		   
    	    		System.out.println(i+1+" : "+list.get(device-1)[i].toString());
    	    		System.out.println("");
 
		
    	    	}
    	    	System.out.println(brick);
 
  		
    	    }
    	    
    	    
    	    else  {
    	    	check = false;
    	    
    	  
    	    
    	    switch(device){
    	    case 1:     		  
    	    	socketNum = Integer.parseInt(list.get(device-1)[z-1].soket);
    	    	rams = new String[socketNum];
    	    	for(int i =0; i<socketNum ; i++){
    	    		rams[i]="선택 없음";                          //램 배열을 선택없음으로 초기화
    	    	}
    	    	break;
    	   /* case 4 :
    	    	if(socketNum == 0){
    	    		}*/
    	    	}
    	    	
    	    	
    	    
    	   }//while
    	   }
    	 
    	   chosenName[device-1] = list.get(device-1)[z-1].Name.toString();
    	   chosenPrice[device-1] = list.get(device-1)[z-1].Price;
    			
    	   
    	   System.out.println("메인보드  : "+chosenName[0]+" /CPU : "+chosenName[1]+" /그래픽카드 : "+chosenName[2]+" /RAM : "+chosenName[3]+
    			                "/\nSSD : "+chosenName[4]+"/HDD : "+chosenName[5]+"/POWER : "+chosenName[6]+" /합산 가격 : "+com.sum(chosenPrice)+"원");
    	   
    	   System.out.println(brick);
    	   
    	    	   
    	   
    	   System.out.println("또 다른 하드웨어의 종류를 선택하세요.");
    		System.out.println(brick);
 
    	   com.itemChoose();
		}}
    	   
		
		if(n == 1)
		{check = false;}}
    	   
   	   
    	   
    	   
    	   
    	   
    	
	}
 
}


