package be.heh.petclinic.component.vet;

import java.util.ArrayList;
import java.util.List;

import be.heh.petclinic.domain.*;

class VetComponentImpl implements VetComponent {

    private List<Vet> vets = new ArrayList<>();

    public VetComponentImpl(){
        vets.clear();
        vets.add(new Vet("James","James","none"));
        vets.add(new Vet("Helen","Helen","radiology"));
        vets.add(new Vet("Linda","Linda","surgery"));
    }

    @Override
    public List<Vet> getVets() {
        return vets;
    }
    @Override
    public Vet getVet(String Name) {
        for (Vet var : this.vets){
            if(var.getLastname().equals(Name))
            {
                return var;
            }
        }
        return null;
    }


}