package Chapter6;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class appDemo {

	public static void main(String[] args) {
		
// 图形化界面：JOptionPane.showMessageDialog(父窗体对象,"提示信息","标题",消息类型，图片);
//		JOptionPane.showMessageDialog(null, "今天撸小动物么？", "小动物需求", JOptionPane.ERROR_MESSAGE, new ImageIcon("image/cover.png"));
//		JOptionPane.showInputDialog(null, "选择今天要宠幸撸的小动物", "选择小动物", 0, new ImageIcon("image/smile.png"), new String[] {"1.ha","2.haha"},"想好再输入");
//		JOptionPane.showConfirmDialog(null, "想好了没！");
//定义参数：
		String[] everPets = {"dog","pig","rab","cat","",""};
		String[] newPets = {"dog2",""};
		String[] petLevelName = {"低级","高级","超级","超高级","VVVIP"};
		int[] petLevel = new int[6];
		int petNum = 4; 
		int[] loveScore = new int[6];
		for(int i = 0; i< petNum; i++) {
			loveScore[i] = 100 ;
		    petLevel[i] = 0;
		}
		
//		选择操作1.增加
//		2.修改状态
//		3.删除
//		4.查找
//		限制：1）10天。   2）3个人60以下，删除。  3）		
		//（图形化）
		int days = 0;
		while( days <= 10){
			System.out.println("铲屎官，选择你今天要进行的操作" + "\t" + days + "天");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			switch(choice){
			case 1:			
				if(petNum == everPets.length) { 
					System.out.println("你要的太多了！已经没有地方再领养了！");
					break;
				}
				System.out.println("pick一个新玩伴");
				String newName = input.next();//（图形化改成选择）				
				everPets[petNum] = newName;
				loveScore[petNum] = 100;
				petNum++;
				break;
		case 2:
				System.out.println("选择你要宠幸的小动物");//（图形化改成选择）
				String inputPets = input.next();
				int searchIndex = Integer.MAX_VALUE;//能都找到的触发
				for(int i = 0; i < everPets.length; i++) {
					if(inputPets.compareTo(everPets[i]) == 0) {		//名字相等inputPets equals(everPets[i])			
						searchIndex = i;	
						break;
					}
				}
				if(searchIndex == Integer.MAX_VALUE) { 
					System.out.println("仓库中没有你的宠物");//没找到
					break;		
				}
				loveScore[searchIndex] += 20;
				if(petLevel[searchIndex]+1 == petLevelName.length) {
					System.out.println(inputPets + "在顶端，不能再宠幸了");
					break;
				}
				petLevel[searchIndex]++;	
				for(int i = 0; i < everPets.length; i++) {
					if(i == searchIndex)
						continue;
					loveScore[i]-=10;	
					System.out.printf("%s   %d   %s\n",everPets[i],loveScore[i],petLevelName[petLevel[i]]);
				}				
			//打印结果
			case 3:
			case 4:


				
			}
			days+=1;
		}
			
				
		
	
	}

}
