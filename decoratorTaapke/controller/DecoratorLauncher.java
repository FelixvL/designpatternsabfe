package designpatternsabfe.decoratorTaapke.controller;

import designpatternsabfe.decoratorTaapke.model.*;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class DecoratorLauncher {

    public static void main(String[] args) {
        Werknemer freelancer = new Freelancer("Pim");
        Werknemer freelancerTeamleider = new TeamleiderWerknemerUitbreiding(freelancer);

        Freelancer freelancerC = (Freelancer) freelancer;
        System.out.printf("%s is een freelancer die teamleider is en heeft de taken: \n", freelancerC.getNaam());
        freelancerTeamleider.geefTaken();
        System.out.println();

        Werknemer freelancer2 = new Freelancer("Sandra");
        Werknemer freelancerVoorzitter = new VoorzitterWerknemerUitbreiding(freelancer2, false);

        Freelancer freelancer2C = (Freelancer) freelancer2;
        System.out.printf("%s is een freelancer die voorzitter is en heeft de taken: \n", freelancer2C.getNaam());
        freelancerVoorzitter.geefTaken();
        System.out.println();

        Werknemer bewaker = new Bewaker("Bella");
        Werknemer bewakerVakantiekracht = new VakantiekrachtWerknemerUitbreiding(bewaker);

        Bewaker bewakerC = (Bewaker) bewaker;
        System.out.printf("%s is een bewaker die vakantiekracht is en heeft de taken: \n", bewakerC.getNaam());
        bewakerVakantiekracht.geefTaken();
        System.out.println();


        Werknemer stagair = new Stagair("Dirk", 1000);
        Werknemer stagairTeamleider = new VoorzitterWerknemerUitbreiding(stagair, true);

        Stagair stagairC = (Stagair) stagair;
        System.out.printf("%s is een stagair die voorzitter is en heeft de taken: \n", stagairC.getNaam());
        stagairTeamleider.geefTaken();
        System.out.println();



    }
}
