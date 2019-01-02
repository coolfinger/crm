/**   
 * 
 * @Package: com.crm.wcx.entity 
 * @author: ColdFingers   
 * @date: 2018年11月8日 下午3:13:05 
 */
package com.crm.wcx.entity;

/** 
 * @ClassName: CpuInfoVo 
 * @Description: TODO
 * @author: ColdFingers
 * @date: 2018年11月8日 下午3:13:05  
 */
public class CpuInfoVo {
	
	private int cpuMhz;
    private String cpuIdle;
    private String cpuCombined;
    public int getCpuMhz() {
        return cpuMhz;
    }
    public void setCpuMhz(int cpuMhz) {
        this.cpuMhz = cpuMhz;
    }

    public String getCpuCombined() {
        return cpuCombined;
    }
    public void setCpuCombined(String cpuCombined) {
        this.cpuCombined = cpuCombined;
    }
    public String getCpuIdle() {
        return cpuIdle;
    }
    public void setCpuIdle(String cpuIdle) {
        this.cpuIdle = cpuIdle;
    }

}
