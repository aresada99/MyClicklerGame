package MyClickerGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class game {
	static int coins = 0; // 1.000.000.000 = 1 silver bar
	static int silverBars = 0;
	static int goldBars = 0;
	
	static int countOfSUPERM=1;
	static int countOfAPT=0;
	static int countOfOFFICE=0;
	static int countOfSHOPPINGM=0;
	static int countOfHOTEL=0;
	static int countOfPLAZA=0;
	static int countOfLAND=0;
	
	static int multiplierSUPERM = 1;
	static int multiplierAPT = 1;
	static int multiplierOFFICE = 1;
	static int multiplierSHOPPINGM = 1;
	static int multiplierHOTEL = 1;
	static int multiplierPLAZA = 1;
	static int multiplierLAND = 1;
	
	static boolean isAPTbought = false;
	static boolean isOFFICEbought = false;
	static boolean isSHOPPINGMbought = false;
	static boolean isHOTELbought = false;
	static boolean isPLAZAbought = false;
	static boolean isLANDbought = false;
	
	
	static String passwordOfCheats = "697199";
	static int cheatClickCount = 0;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Clicker!");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		JPanel mainScreen = new JPanel();
		frame.add(mainScreen);
		mainScreen.setLayout(null);
		
		JLabel balanceLabel = new JLabel("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
		balanceLabel.setBounds(10, 10, 900, 20);
		balanceLabel.setFont(new Font("Courier",Font.PLAIN,25));
		mainScreen.add(balanceLabel);
		
		
		
		////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////
		////////////////CLICKERS////////////////////////////////////////////////////////
		JButton superMarket = new JButton("Super Market");
		superMarket.setBounds(10, 150, 150, 100);
		superMarket.setBackground(Color.LIGHT_GRAY);
		superMarket.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(superMarket);
		
		////////////////////////////////////////////////////////////////////////////////
		JButton Apartment = new JButton("Apartment");
		Apartment.setBounds(190, 150, 150, 100);
		Apartment.setBackground(Color.LIGHT_GRAY);
		Apartment.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(Apartment);
		Apartment.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JButton office = new JButton("Office");
		office.setBounds(380, 150, 150, 100);
		office.setBackground(Color.LIGHT_GRAY);
		office.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(office);
		office.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JButton ShoppingMall = new JButton("Shopping Mall");
		ShoppingMall.setBounds(570, 150, 150, 100);
		ShoppingMall.setBackground(Color.LIGHT_GRAY);
		ShoppingMall.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(ShoppingMall);
		ShoppingMall.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JButton hotel = new JButton("Hotel");
		hotel.setBounds(760, 150, 150, 100);
		hotel.setBackground(Color.LIGHT_GRAY);
		hotel.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(hotel);
		hotel.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JButton plaza = new JButton("Plaza");
		plaza.setBounds(950, 150, 150, 100);
		plaza.setBackground(Color.LIGHT_GRAY);
		plaza.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(plaza);
		plaza.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JButton land = new JButton("Land");
		land.setBounds(1140, 150, 150, 100);
		land.setBackground(Color.LIGHT_GRAY);
		land.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(land);
		land.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////
		JLabel superMarketCount = new JLabel("Count: "+Integer.toString(countOfSUPERM));
		superMarketCount.setBounds(50,300,100,20);
		superMarketCount.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(superMarketCount);
		////////////////////////////////////////////////////////////////////////////////
		JLabel ApartmentCount = new JLabel("Count: "+Integer.toString(countOfAPT));
		ApartmentCount.setBounds(240,300,100,20);
		ApartmentCount.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(ApartmentCount);
		ApartmentCount.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JLabel officeCount = new JLabel("Count: "+Integer.toString(countOfOFFICE));
		officeCount.setBounds(430,300,100,20);
		officeCount.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(officeCount);
		officeCount.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JLabel ShoppingMallCount = new JLabel("Count: "+Integer.toString(countOfSHOPPINGM));
		ShoppingMallCount.setBounds(620,300,100,20);
		ShoppingMallCount.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(ShoppingMallCount);
		ShoppingMallCount.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JLabel hotelCount = new JLabel("Count: "+Integer.toString(countOfHOTEL));
		hotelCount.setBounds(810,300,100,20);
		hotelCount.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(hotelCount);
		hotelCount.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JLabel plazaCount = new JLabel("Count: "+Integer.toString(countOfPLAZA));
		plazaCount.setBounds(1000,300,100,20);
		plazaCount.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(plazaCount);
		plazaCount.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		JLabel landCount = new JLabel("Count: "+Integer.toString(countOfLAND));
		landCount.setBounds(1190,300,100,20);
		landCount.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(landCount);
		landCount.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////	
		////////////////////////////////////////////////////////////////////////////////
		JLabel superMarketMultiplier = new JLabel("Multiplier: "+Integer.toString(multiplierSUPERM));
		superMarketMultiplier.setBounds(50,360,150,20);
		superMarketMultiplier.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(superMarketMultiplier);
		////////////////////////////////////////////////////////////////////////////////
		JLabel apartmentMultiplier = new JLabel("Multiplier: "+Integer.toString(multiplierAPT));
		apartmentMultiplier.setBounds(240,360,150,20);
		apartmentMultiplier.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(apartmentMultiplier);
		apartmentMultiplier.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////	
		JLabel officeMultiplier = new JLabel("Multiplier: "+Integer.toString(multiplierOFFICE));
		officeMultiplier.setBounds(430,360,150,20);
		officeMultiplier.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(officeMultiplier);
		officeMultiplier.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////	
		JLabel ShoppingMallMultiplier = new JLabel("Multiplier: "+Integer.toString(multiplierSHOPPINGM));
		ShoppingMallMultiplier.setBounds(620,360,150,20);
		ShoppingMallMultiplier.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(ShoppingMallMultiplier);
		ShoppingMallMultiplier.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////	
		JLabel hotelMultiplier = new JLabel("Multiplier: "+Integer.toString(multiplierHOTEL));
		hotelMultiplier.setBounds(810,360,150,20);
		hotelMultiplier.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(hotelMultiplier);
		hotelMultiplier.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////	
		JLabel plazaMultiplier = new JLabel("Multiplier: "+Integer.toString(multiplierPLAZA));
		plazaMultiplier.setBounds(1000,360,150,20);
		plazaMultiplier.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(plazaMultiplier);
		plazaMultiplier.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////	
		JLabel landMultiplier = new JLabel("Multiplier: "+Integer.toString(multiplierLAND));
		landMultiplier.setBounds(1190,360,150,20);
		landMultiplier.setFont(new Font("Courier",Font.PLAIN,18));
		mainScreen.add(landMultiplier);
		landMultiplier.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////	
		////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		/////////////TIMERS/////////////////////
		
		
		
		Timer testCoins = new Timer();
		TimerTask test = new TimerTask() {
		
			
			public void run() {
				if(coins >= 1000000000) {
					coins=coins-1000000000;
					silverBars++;
					balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
				if(silverBars>=1000000000) {
					silverBars=0;
					goldBars++;
					balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
				
			}
			
		};
		testCoins.schedule(test, 0,100);
		
		
		
		
		Timer autoSuperMarket = new Timer();
		TimerTask autoSuperMarketTask = new TimerTask() {

			
			public void run() {
			
				coins = coins + (1*countOfSUPERM*multiplierSUPERM);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		};
		
		Timer autoApartment = new Timer();
		TimerTask autoApartmentTask = new TimerTask() {

			
			public void run() {
			
				coins = coins + (100*countOfAPT*multiplierAPT);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		};
		
		Timer autoOffice = new Timer();
		TimerTask autoOfficeTask = new TimerTask() {

			
			public void run() {
			
				coins = coins + (1000*countOfOFFICE*multiplierOFFICE);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		};
		
		Timer autoShoppingMall = new Timer();
		TimerTask autoShoppingMallTask = new TimerTask() {

			
			public void run() {
			
				coins = coins + (10000*countOfSHOPPINGM*multiplierSHOPPINGM);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		};
		
		Timer autoHotel = new Timer();
		TimerTask autoHotelTask = new TimerTask() {

			
			public void run() {
			
				coins = coins + (100000*countOfHOTEL*multiplierHOTEL);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		};
		
		Timer autoPlaza = new Timer();
		TimerTask autoPlazaTask = new TimerTask() {

			
			public void run() {
			
				coins = coins + (1000000*countOfPLAZA*multiplierPLAZA);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		};
		
		Timer autoLand = new Timer();
		TimerTask autoLandTask = new TimerTask() {

			
			public void run() {
			
				coins = coins + (10000000*countOfLAND*multiplierLAND);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		};
		
		///////////////////////////////////////////////////
		
		
		
		superMarket.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				coins = coins + (1*countOfSUPERM*multiplierSUPERM);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
			});
		
		Apartment.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				coins = coins + (100*countOfAPT*multiplierAPT);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
			});
		
		office.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				coins = coins + (1000*countOfOFFICE*multiplierOFFICE);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
			});
		
		ShoppingMall.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				coins = coins + (10000*countOfSHOPPINGM*multiplierSHOPPINGM);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
			});
		
		hotel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				coins = coins + (100000*countOfHOTEL*multiplierHOTEL);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
			});
		plaza.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				coins = coins + (1000000*countOfPLAZA*multiplierPLAZA);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
			});
		
		land.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				coins = coins + (10000000*countOfLAND*multiplierLAND);
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
				}
			});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JFrame shopFrame = new JFrame("Shop") ;
		shopFrame.setSize(500, 890);
		shopFrame.setLocation(1318, 0);
		shopFrame.setResizable(false);
		JPanel panel = new JPanel();
		shopFrame.add(panel);
		panel.setLayout(null);
		
		
		
		JButton buySuperMarket = new JButton("Buy: Super Market || Price: 100 Coins || 1 Coins ");
		buySuperMarket.setBounds(10, 10, 475,30);
		buySuperMarket.setFont(new Font("Courier",Font.BOLD,14));
		buySuperMarket.setBackground(Color.green);
		panel.add(buySuperMarket);
		
		JButton buyApartment = new JButton("Buy: Apartment || Price: 10.000 Coins || 100 Coins ");
		buyApartment.setBounds(10, 50, 475, 30);
		buyApartment.setFont(new Font("Courier",Font.BOLD,14));
		buyApartment.setBackground(Color.green);
		panel.add(buyApartment);
	
		JButton buyOffice = new JButton("Buy: Office || Price: 100.000 Coins || 1.000 Coins ");
		buyOffice.setBounds(10, 90, 475, 30);
		buyOffice.setFont(new Font("Courier",Font.BOLD,14));
		buyOffice.setBackground(Color.green);
		panel.add(buyOffice);
		
		JButton buyShoppingMall = new JButton("Buy: Shopping Mall || Price: 1.000.000 Coins || 10.000 Coins ");
		buyShoppingMall.setBounds(10, 130, 475, 30);
		buyShoppingMall.setFont(new Font("Courier",Font.BOLD,14));
		buyShoppingMall.setBackground(Color.green);
		panel.add(buyShoppingMall);
		
		JButton buyHotel = new JButton("Buy: Hotel || Price: 10.000.000 Coins || 100.000 Coins ");
		buyHotel.setBounds(10, 170, 475, 30);
		buyHotel.setFont(new Font("Courier",Font.BOLD,14));
		buyHotel.setBackground(Color.green);
		panel.add(buyHotel);
		
		JButton buyPlaza = new JButton("Buy: Plaza || Price: 100.000.000 Coins || 1.000.000 Coins ");
		buyPlaza.setBounds(10, 210, 475, 30);
		buyPlaza.setFont(new Font("Courier",Font.BOLD,14));
		buyPlaza.setBackground(Color.green);
		panel.add(buyPlaza);
		
		JButton buyLand = new JButton("Buy: Land || Price: 1 Silver Bars || 10.000.000 Coins ");
		buyLand.setBounds(10, 250, 475, 30);
		buyLand.setFont(new Font("Courier",Font.BOLD,14));
		buyLand.setBackground(Color.green);
		panel.add(buyLand);
		
		
		
		
		buySuperMarket.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				if(coins>=100) {
					if(countOfSUPERM==100) {
						buySuperMarket.setVisible(false);
					}
					else {
						countOfSUPERM++;
						System.out.println("Super Market succesfully bought!");
						coins=coins-100;
						superMarketCount.setText("Count: "+Integer.toString(countOfSUPERM));
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						cheatClickCount=0;
						if(countOfSUPERM==100) {
							buySuperMarket.setVisible(false);
						}
					}
				}
				else {
					System.out.println("Not enough money!");
				}
				

			}
			
		});
		
		
		
		buyApartment.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				if(coins>=10000) {
					if(countOfAPT==100) {
						buyApartment.setVisible(false);
					}
					else {
						countOfAPT++;
						System.out.println("Apartment succesfully bought!");
						coins=coins-10000;
						ApartmentCount.setText("Count: "+Integer.toString(countOfAPT));
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						ApartmentCount.setVisible(true);
						apartmentMultiplier.setVisible(true);
						Apartment.setVisible(true);
						cheatClickCount=0;
						isAPTbought=true;
						if(countOfAPT==100) {
							buyApartment.setVisible(false);
						}
					}
				}
				else {
					System.out.println("Not enough money!");
				}
				

			}
			
		});
		
		
		
		buyOffice.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				if(coins>=100000) {
					if(countOfOFFICE==100) {
						buyOffice.setVisible(false);
					}
					else {
						countOfOFFICE++;
						System.out.println("Office succesfully bought!");
						coins=coins-100000;
						officeCount.setText("Count: "+Integer.toString(countOfOFFICE));
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						officeCount.setVisible(true);
						officeMultiplier.setVisible(true);
						office.setVisible(true);
						cheatClickCount=0;
						isOFFICEbought=true;
						if(countOfOFFICE==100) {
							buyOffice.setVisible(false);
						}
					}
				}
				else {
					System.out.println("Not enough money!");
				}
				

			}
			
		});
		
		
		
		
		
		
		buyShoppingMall.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				if(coins>=1000000) {
					if(countOfSHOPPINGM==100) {
						buyShoppingMall.setVisible(false);
					}
					else {
						countOfSHOPPINGM++;
						System.out.println("Shopping Mall succesfully bought!");
						coins=coins-1000000;
						ShoppingMallCount.setText("Count: "+Integer.toString(countOfSHOPPINGM));
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						ShoppingMallCount.setVisible(true);
						ShoppingMallMultiplier.setVisible(true);
						ShoppingMall.setVisible(true);
						cheatClickCount=0;
						isSHOPPINGMbought=true;
						if(countOfSHOPPINGM==100) {
							buyShoppingMall.setVisible(false);
						}
					}
				}
				else {
					System.out.println("Not enough money!");
				}
				

			}
			
		});
		
		
		
		buyHotel.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				if(coins>=10000000) {
					if(countOfHOTEL==100) {
						buyHotel.setVisible(false);
					}
					else {
						countOfHOTEL++;
						System.out.println("Hotel succesfully bought!");
						coins=coins-10000000;
						hotelCount.setText("Count: "+Integer.toString(countOfHOTEL));
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						hotelCount.setVisible(true);
						hotelMultiplier.setVisible(true);
						hotel.setVisible(true);
						cheatClickCount=0;
						isHOTELbought=true;
						if(countOfHOTEL==100) {
							buyHotel.setVisible(false);
						}
					}
				}
				else {
					System.out.println("Not enough money!");
				}
				

			}
			
		});
		
		
		
		buyPlaza.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				if(coins>=100000000) {
					if(countOfPLAZA==100) {
						buyPlaza.setVisible(false);
					}
					else {
						countOfPLAZA++;
						System.out.println("Plaza succesfully bought!");
						coins=coins-100000000;
						plazaCount.setText("Count: "+Integer.toString(countOfPLAZA));
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						plazaCount.setVisible(true);
						plazaMultiplier.setVisible(true);
						plaza.setVisible(true);
						cheatClickCount=0;
						isPLAZAbought=true;
						if(countOfPLAZA==100) {
							buyPlaza.setVisible(false);
						}
					}
				}
				else {
					System.out.println("Not enough money!");
				}
				

			}
			
		});
		
		
		
		buyLand.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				if(silverBars>=1) {
					if(countOfLAND==100) {
						buyLand.setVisible(false);
					}
					else {
						countOfLAND++;
						System.out.println("Land succesfully bought!");
						silverBars=silverBars-1;
						landCount.setText("Count: "+Integer.toString(countOfLAND));
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						landCount.setVisible(true);
						landMultiplier.setVisible(true);
						land.setVisible(true);
						cheatClickCount=0;
						isLANDbought=true;
						if(countOfLAND==100) {
							buyLand.setVisible(false);
						}
					}
				}
				else {
					System.out.println("Not enough money!");
				}
				

			}
			
		});
		
		
		JButton buySuperMarketMultiplier = new JButton("Buy: Super Market multiplier || Price: 1.000");
		buySuperMarketMultiplier.setBounds(10, 290, 475, 30);
		buySuperMarketMultiplier.setFont(new Font("Courier",Font.BOLD,14));
		buySuperMarketMultiplier.setBackground(Color.RED);
		panel.add(buySuperMarketMultiplier);
		
		JButton buyApartmentMultiplier = new JButton("Buy: Apartment multiplier || Price: 100.000");
		buyApartmentMultiplier.setBounds(10, 330, 475, 30);
		buyApartmentMultiplier.setFont(new Font("Courier",Font.BOLD,14));
		buyApartmentMultiplier.setBackground(Color.RED);
		panel.add(buyApartmentMultiplier);
		
		JButton buyOfficeMultiplier = new JButton("Buy: Office multiplier || Price: 1.000.000");
		buyOfficeMultiplier.setBounds(10, 370, 475, 30);
		buyOfficeMultiplier.setFont(new Font("Courier",Font.BOLD,14));
		buyOfficeMultiplier.setBackground(Color.RED);
		panel.add(buyOfficeMultiplier);
		
		JButton buyShoppingMallMultiplier = new JButton("Buy: Shopping Mall multiplier || Price: 10.000.000");
		buyShoppingMallMultiplier.setBounds(10, 410, 475, 30);
		buyShoppingMallMultiplier.setFont(new Font("Courier",Font.BOLD,14));
		buyShoppingMallMultiplier.setBackground(Color.RED);
		panel.add(buyShoppingMallMultiplier);
		
		JButton buyHotelMultiplier = new JButton("Buy: Hotel multiplier || Price: 100.000.000");
		buyHotelMultiplier.setBounds(10, 450, 475, 30);
		buyHotelMultiplier.setFont(new Font("Courier",Font.BOLD,14));
		buyHotelMultiplier.setBackground(Color.RED);
		panel.add(buyHotelMultiplier);
		
		JButton buyPlazaMultiplier = new JButton("Buy: Plaza multiplier || Price: 1 Silver Bars");
		buyPlazaMultiplier.setBounds(10, 490, 475, 30);
		buyPlazaMultiplier.setFont(new Font("Courier",Font.BOLD,14));
		buyPlazaMultiplier.setBackground(Color.RED);
		panel.add(buyPlazaMultiplier);
		
		JButton buyLandMultiplier = new JButton("Buy: Land multiplier || Price: 10 Silver Bars");
		buyLandMultiplier.setBounds(10, 530, 475, 30);
		buyLandMultiplier.setFont(new Font("Courier",Font.BOLD,14));
		buyLandMultiplier.setBackground(Color.RED);
		panel.add(buyLandMultiplier);
		
		
		
		buySuperMarketMultiplier.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(multiplierSUPERM==100) {
					buySuperMarketMultiplier.setVisible(false);
				}
				
				else {
				if(coins>=1000) {
					multiplierSUPERM++;
					superMarketMultiplier.setText("Multiplier: "+Integer.toString(multiplierSUPERM));
					coins=coins-1000;
					balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
					if(multiplierSUPERM==100) {
						buySuperMarketMultiplier.setVisible(false);
					}
				}
				else{
					System.out.println("Not enough money!");
				}
				}
				
			}
			
		});
		
		buyApartmentMultiplier.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(isAPTbought == true) {
					
					if(multiplierAPT==100) {
						buyApartmentMultiplier.setVisible(false);
					}
					
					else {
					if(coins>=100000) {
						multiplierAPT++;
						apartmentMultiplier.setText("Multiplier: "+Integer.toString(multiplierAPT));
						coins=coins-100000;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						if(multiplierAPT==100) {
							buyApartmentMultiplier.setVisible(false);
						}
					}
					else{
						System.out.println("Not enough money!");
					}
					}
				}

				else {System.out.println("First buy Apartment!");}
				
			}
			
		});
		
		buyOfficeMultiplier.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(isOFFICEbought == true) {
					if(multiplierOFFICE==100) {
						buyOfficeMultiplier.setVisible(false);
					}
					
					else {
					if(coins>=1000000) {
						multiplierOFFICE++;
						officeMultiplier.setText("Multiplier: "+Integer.toString(multiplierOFFICE));
						coins=coins-1000000;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						if(multiplierOFFICE==100) {
							buyOfficeMultiplier.setVisible(false);
						}
					}
					else{
						System.out.println("Not enough money!");
					}
					}
				}
				
				else {System.out.println("First buy Office!");}
				
			}
			
		});
		
		buyShoppingMallMultiplier.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(isSHOPPINGMbought == true) {
					if(multiplierSHOPPINGM==100) {
						buyShoppingMallMultiplier.setVisible(false);
					}
					
					else {
					if(coins>=10000000) {
						multiplierSHOPPINGM++;
						ShoppingMallMultiplier.setText("Multiplier: "+Integer.toString(multiplierSHOPPINGM));
						coins=coins-10000000;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						if(multiplierSHOPPINGM==100) {
							buyShoppingMallMultiplier.setVisible(false);
						}
					}
					else{
						System.out.println("Not enough money!");
					}
					}
				}
				else {System.out.println("First buy Shopping Mall!");}

				
			}
			
		});
		
		buyHotelMultiplier.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(isHOTELbought==true) {
					if(multiplierHOTEL==100) {
						buyHotelMultiplier.setVisible(false);
					}
					
					else {
					if(coins>=100000000) {
						multiplierHOTEL++;
						hotelMultiplier.setText("Multiplier: "+Integer.toString(multiplierHOTEL));
						coins=coins-100000000;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						if(multiplierHOTEL==100) {
							buyHotelMultiplier.setVisible(false);
						}
						
					}
					else{
						System.out.println("Not enough money!");
					}
					}
				}
				
				else {System.out.println("First buy Hotel!");}
				
			}
			
		});
		
		buyPlazaMultiplier.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(isPLAZAbought==true) {
					
					if(multiplierPLAZA==100) {
						buyPlazaMultiplier.setVisible(false);
					}
					
					else {
					if(silverBars >=1) {
						multiplierPLAZA++;
						plazaMultiplier.setText("Multiplier: "+Integer.toString(multiplierPLAZA));
						silverBars=silverBars-1;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						if(multiplierPLAZA==100) {
							buyPlazaMultiplier.setVisible(false);
						}
					}
					else{
						System.out.println("Not enough money!");
					}
					}
				}
				
				else {System.out.println("First buy Plaza!");}
				
			}
			
		});
		
		buyLandMultiplier.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(isLANDbought==true) {
					if(multiplierLAND==100) {
						buyLandMultiplier.setVisible(false);
					}
					
					else {
					if(silverBars >=10) {
						multiplierLAND++;
						landMultiplier.setText("Multiplier: "+Integer.toString(multiplierLAND));
						silverBars=silverBars-10;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						if(multiplierLAND==100) {
							buyLandMultiplier.setVisible(false);
						}
					}
					else{
						System.out.println("Not enough money!");
					}
					}
				}
				
				else {System.out.println("First buy Land");}
				
			}
			
		});
		
		
		
		
		JButton buyAutoSuperMarket = new JButton("Buy: Automate SuperMarket || Price: 100");
		buyAutoSuperMarket.setBounds(10, 570, 475, 30);
		buyAutoSuperMarket.setFont(new Font("Courier",Font.BOLD,14));
		buyAutoSuperMarket.setBackground(Color.BLUE);
		panel.add(buyAutoSuperMarket);
		
		JButton buyAutoApartment = new JButton("Buy: Automate Apartment || Price: 1.000.000");
		buyAutoApartment.setBounds(10, 610, 475, 30);
		buyAutoApartment.setFont(new Font("Courier",Font.BOLD,14));
		buyAutoApartment.setBackground(Color.BLUE);
		panel.add(buyAutoApartment);
		
		JButton buyAutoOffice = new JButton("Buy: Automate Office || Price: 10.000.000");
		buyAutoOffice.setBounds(10, 650, 475, 30);
		buyAutoOffice.setFont(new Font("Courier",Font.BOLD,14));
		buyAutoOffice.setBackground(Color.BLUE);
		panel.add(buyAutoOffice);
		
		JButton buyAutoShoppingMall = new JButton("Buy: Automate Shopping Mall || Price: 100.000.000");
		buyAutoShoppingMall.setBounds(10, 690, 475, 30);
		buyAutoShoppingMall.setFont(new Font("Courier",Font.BOLD,14));
		buyAutoShoppingMall.setBackground(Color.BLUE);
		panel.add(buyAutoShoppingMall);
		
		JButton buyAutoHotel = new JButton("Buy: Automate Hotel || Price: 1 Silver Bars");
		buyAutoHotel.setBounds(10, 730, 475, 30);
		buyAutoHotel.setFont(new Font("Courier",Font.BOLD,14));
		buyAutoHotel.setBackground(Color.BLUE);
		panel.add(buyAutoHotel);
		
		JButton buyAutoPlaza = new JButton("Buy: Automate Plaza || Price: 10 Silver Bars");
		buyAutoPlaza.setBounds(10, 770, 475, 30);
		buyAutoPlaza.setFont(new Font("Courier",Font.BOLD,14));
		buyAutoPlaza.setBackground(Color.BLUE);
		panel.add(buyAutoPlaza);
		
		JButton buyAutoLand = new JButton("Buy: Automate Land || Price: 100 Silver Bars");
		buyAutoLand.setBounds(10, 810, 475, 30);
		buyAutoLand.setFont(new Font("Courier",Font.BOLD,14));
		buyAutoLand.setBackground(Color.BLUE);
		panel.add(buyAutoLand);
		
		
		
		
		
		
		
		buyAutoSuperMarket.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {

				
				
				if(coins>=100) {
					
					autoSuperMarket.schedule(autoSuperMarketTask, 0,100);
					coins=coins-100;
					balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
					buyAutoSuperMarket.setVisible(false);
				}
				else{
					System.out.println("Not enough money!");
				}
				
				
			}
			
		});
		
		
		buyAutoApartment.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {

				if(isAPTbought==true) {
				
				if(coins>=1000000) {
					
					autoApartment.schedule(autoApartmentTask, 0, 200);
					coins=coins-1000000;
					balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
					buyAutoApartment.setVisible(false);
				}
				else{
					System.out.println("Not enough money!");
				}
				}
				else {System.out.println("First buy Apartment!");}
			}
			
		});
		
		
		buyAutoOffice.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {

				if(isOFFICEbought==true) {
					if(coins>=10000000) {
						
						autoOffice.schedule(autoOfficeTask, 0, 250);
						coins=coins-10000000;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						buyAutoOffice.setVisible(false);
					}
					else{
						System.out.println("Not enough money!");
					}
				}
				

				else {System.out.println("First buy Office!");}
				
			}
			
		});
		
		buyAutoShoppingMall.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {

				if(isSHOPPINGMbought==true) {
					if(coins>=100000000) {
						
						autoShoppingMall.schedule(autoShoppingMallTask, 0, 300);
						coins=coins-100000000;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						buyAutoShoppingMall.setVisible(false);
					}
					else{
						System.out.println("Not enough money!");
					}
				}
				

				else {System.out.println("First buy Shopping Mall!");}
				
			}
			
		});
		
		buyAutoHotel.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {

				if(isHOTELbought==true) {
					if(silverBars>=1) {
						
						autoHotel.schedule(autoHotelTask, 0, 500);
						silverBars=silverBars-1;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						buyAutoHotel.setVisible(false);
					}
					else{
						System.out.println("Not enough money!");
					}
				}
				

				else {System.out.println("First buy Hotel!");}
				
			}
			
		});
		
		buyAutoPlaza.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {

				if(isPLAZAbought==true) {
					if(silverBars>=10) {
						
						autoPlaza.schedule(autoPlazaTask, 0, 800);
						silverBars=silverBars-10;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						buyAutoPlaza.setVisible(false);
					}
					else{
						System.out.println("Not enough money!");
					}
				}
				
				else {System.out.println("First buy Plaza!");}
				
				
			}
			
		});
		
		buyAutoLand.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {

				if(isLANDbought==true) {
					if(silverBars>=100) {
						
						autoLand.schedule(autoLandTask, 0, 1000);
						silverBars=silverBars-100;
						balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
						buyAutoLand.setVisible(false);
					}
					else{
						System.out.println("Not enough money!");
					}
				}
				
				else {System.out.println("First buy Land!");}
				
				
			}
			
		});
		
		
		
		////////////////////////////INFO INFO INFO//////////////////////
		
		JButton info = new JButton("-> Information <-");
		info.setBounds(10, 500, 220, 50);
		info.setBackground(Color.CYAN);
		info.setFont(new Font("Courier",Font.BOLD,20));
		mainScreen.add(info);
		
		JFrame infoFrame = new JFrame("Information about game");
		infoFrame.setLocation(500, 100);
		infoFrame.setSize(518,600);
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoFrame.add(infoPanel);
		
		
		JLabel mainTitle = new JLabel("What's the game about? :");
		mainTitle.setBounds(5, 5, 500, 30);
		mainTitle.setFont(new Font("Courier",Font.BOLD,26));
		infoPanel.add(mainTitle);
		
		JLabel line1 = new JLabel("It's a clicker game. Every click will earn you some coins.Later on,");
		line1.setBounds(20, 55, 500, 20);
		line1.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line1);
		
		JLabel line2 = new JLabel("some helper products in shop can even click for you!");
		line2.setBounds(5, 75, 500, 20);
		line2.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line2);
		
		JLabel shopHelperTitle = new JLabel("SHOP HELPER :");
		shopHelperTitle.setBounds(5, 125, 500, 20);
		shopHelperTitle.setFont(new Font("Courier",Font.BOLD,26));
		infoPanel.add(shopHelperTitle);
		
		JLabel line3 = new JLabel("Buying a place (GREEN): If you already have this place,count");
		line3.setBounds(20, 170, 500, 20);
		line3.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line3);
		
		JLabel line4 = new JLabel("increases 1. If you have 100 of that place, you can't buy more!");
		line4.setBounds(5, 190, 500, 20);
		line4.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line4);
		
		JLabel line5 = new JLabel("Buying a multiplier (RED): Every purchase adds your multiplier to 1");
		line5.setBounds(20, 230, 500, 20);
		line5.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line5);
		
		JLabel line6 = new JLabel("and your earning on that place will be multiplied by it.");
		line6.setBounds(5, 250, 500, 20);
		line6.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line6);
		
		JLabel line7 = new JLabel("Buying a Automate (BLUE): After buying this, clicks will be done");
		line7.setBounds(20, 290, 500, 20);
		line7.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line7);
		
		JLabel line8 = new JLabel("automatically on specific place. (For example: If you buy automate for");
		line8.setBounds(5, 310, 500, 20);
		line8.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line8);
		
		JLabel line9 = new JLabel("Super Market, it only clicks Super Market automatically.You need to");
		line9.setBounds(5, 330, 500, 20);
		line9.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line9);
		
		JLabel line10 = new JLabel("buy which of your place to become automatic.");
		line10.setBounds(5, 350, 500, 20);
		line10.setFont(new Font("Courier",Font.BOLD,15));
		infoPanel.add(line10);
		
		JLabel balanceHelperTitle = new JLabel("Coins - Silver Bars - Gold Bars :");
		balanceHelperTitle.setBounds(5, 400, 500, 20);
		balanceHelperTitle.setFont(new Font("Courier",Font.BOLD,26));
		infoPanel.add(balanceHelperTitle);
		
		JLabel line11 = new JLabel("1  Gold Bar  =  1.000.000.000  Silver Bars ");
		line11.setBounds(20, 450, 500, 20);
		line11.setFont(new Font("Courier",Font.BOLD,19));
		infoPanel.add(line11);
		
		JLabel line12 = new JLabel("1  Silver Bar  =  1.000.000.000  Coins ");
		line12.setBounds(20, 480, 500, 20);
		line12.setFont(new Font("Courier",Font.BOLD,19));
		infoPanel.add(line12);
		
		
		
		info.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				infoFrame.setVisible(true);
				
			}
			
		});
		
		
		
		
		
		//////////////////////////////////////////////////////////////7
		
		
		
		
		

		
		
		JButton shop = new JButton("$          Shop          $");
		shop.setBounds(1000, 10, 300, 80);
		shop.setBackground(Color.GREEN);
		shop.setFont(new Font("Courier",Font.BOLD,25));
		mainScreen.add(shop);
		

		
		
		
		
		
		JTextField pass = new JTextField();
		mainScreen.add(pass);
		pass.setBounds(1250,520,50,20);
		JButton passButton = new JButton("Go");
		mainScreen.add(passButton);
		passButton.setBounds(1250, 540, 50, 20);
		passButton.setBackground(Color.BLACK);
		JFrame cheatFrame = new JFrame("Cheats");
		cheatFrame.setSize(420, 300);
		cheatFrame.setLocation(0, 600);
		JPanel cheatPanel = new JPanel();
		cheatFrame.add(cheatPanel);
		cheatPanel.setLayout(null);
		JLabel addCoinsLabel = new JLabel("Enter coins to add.");
		addCoinsLabel.setBounds(10,10,250,20);
		addCoinsLabel.setFont(new Font("Courier",Font.PLAIN,14));
		cheatPanel.add(addCoinsLabel);
		JTextField addCoinsTf = new JTextField();
		addCoinsTf.setBounds(180, 10, 100, 20);
		cheatPanel.add(addCoinsTf);
		JButton addCoinsButton = new JButton("Add");
		addCoinsButton.setBounds(300, 10, 80, 20);
		addCoinsButton.setBackground(Color.red);
		addCoinsButton.setFont(new Font("Courier",Font.PLAIN,14));
		JLabel addSBLabel = new JLabel("Enter Silver Bars to add.");
		addSBLabel.setBounds(10,40,250,20);
		addSBLabel.setFont(new Font("Courier",Font.PLAIN,14));
		cheatPanel.add(addSBLabel);
		JTextField addSBTf = new JTextField();
		addSBTf.setBounds(180, 40, 100, 20);
		cheatPanel.add(addSBTf);
		JButton addSBButton = new JButton("Add");
		addSBButton.setBounds(300, 40, 80, 20);
		addSBButton.setBackground(Color.red);
		addSBButton.setFont(new Font("Courier",Font.PLAIN,14));
		cheatPanel.add(addSBButton);
		cheatPanel.add(addCoinsButton);
		pass.setVisible(false);
		passButton.setVisible(false);
		
		
		
		shop.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				cheatClickCount++;
				if(cheatClickCount==5) {
				pass.setVisible(true);
				passButton.setVisible(true);
				
				}
				
				
				
				
				shopFrame.setVisible(true);
				
			}
			
		});
		
		
		
		
		
		
		addCoinsButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				coins = coins+Integer.parseInt(addCoinsTf.getText());
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		});
		
		
		addSBButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				silverBars = silverBars+Integer.parseInt(addSBTf.getText());
				balanceLabel.setText("Balance:    "+goldBars+" Gold Bars    "+silverBars+" Silver Bars   "+coins+" Coins");
			}
			
		});
		
		passButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				if(pass.getText().equals(passwordOfCheats)) {
				cheatFrame.setVisible(true);
				pass.setText("");
				pass.setVisible(false);
				passButton.setVisible(false);
				cheatClickCount =0;
				}
				pass.setText("");
				pass.setVisible(false);
				passButton.setVisible(false);
				cheatClickCount=0;
			}
			
		});
		
		
		
		
		frame.setSize(1320, 600);
		frame.setVisible(true);
	}
}
