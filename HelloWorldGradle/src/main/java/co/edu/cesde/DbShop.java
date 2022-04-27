package co.edu.cesde;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data

public class DbShop {


    private List<Cpu>cpus;
    private List<Monitor>monitors;
    private List<Mouse>mice;

    public DbShop(){
        cpus=new ArrayList<>();
        monitors=new ArrayList<>();
        mice=new ArrayList<>();
    }
}
