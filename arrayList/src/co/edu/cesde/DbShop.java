package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;

public class DbShop {


    private List<Cpu>cpus;
    private List<Monitor>monitors;
    private List<Mouse>mice;

    public DbShop(){
        cpus=new ArrayList<>();
        monitors=new ArrayList<>();
        mice=new ArrayList<>();
    }

    public void setCpu(Cpu cpu){
        cpus.add(cpu);
    }

    public List<Cpu> getCpus() {
        return cpus;
    }

    public void setCpus(List<Cpu> cpus) {
        this.cpus = cpus;
    }

    public void setMonitor(Monitor monitor){
        monitors.add(monitor);
    }

    public List<Monitor> getMonitors() {
        return monitors;
    }

    public void setMonitors(List<Monitor> monitors) {
        this.monitors = monitors;
    }

    public void setMice(Mouse mouse){
        mice.add(mouse);
    }

    public List<Mouse> getMice() {
        return mice;
    }

    public void setMice(List<Mouse> mice) {
        this.mice = mice;
    }
}
