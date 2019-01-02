import com.crm.wcx.utils.Md5Util;

/**   
 * 
 * @Package:  
 * @author: CoolFingers   
 * @date: 2018年11月10日 下午2:34:08 
 */

/** 
 * @ClassName: test 
 * @Description: TODO
 * @author: CoolFingers
 * @date: 2018年11月10日 下午2:34:08  
 */
public class test {

	/** 
	 * @Title: main 
	 * @Description: TODO 
	 * @param args void
	 * @author CoolFingers
	 * @date 2018年11月10日下午2:34:08
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "admin";
		String salt = "adminadmin";
		String bString = Md5Util.encrypt(a, salt);
		System.out.println(bString);
		
	}

}
