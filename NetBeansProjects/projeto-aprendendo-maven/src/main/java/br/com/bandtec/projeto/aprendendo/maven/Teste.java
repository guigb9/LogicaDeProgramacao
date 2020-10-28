/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.aprendendo.maven;

import java.util.Arrays;
import oshi.SystemInfo;
import oshi.driver.linux.proc.CpuStat;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author guilh
 */
public class Teste {
    public static void main(String[] args) {
        long[][] infoCPU;
        long[] infoCPUTotal;
        
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        
        infoCPU = cpu.getProcessorCpuLoadTicks();
        infoCPUTotal = cpu.getSystemCpuLoadTicks();
        System.out.println(hal.getMemory());
        System.out.println(Arrays.toString(cpu.getProcessorCpuLoadBetweenTicks(infoCPU)));
        System.out.println(cpu.getSystemCpuLoadBetweenTicks(infoCPUTotal));
        
    }
}
