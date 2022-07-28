package designpatternsabfe.decoratorTaapke.controller;

import designpatternsabfe.decoratorTaapke.model.*;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class DecoratorLauncher {

    public static void main(String[] args) {
        Werknemer freelancer = new Freelancer();
        Werknemer freelancerTeamleider = new TeamleiderWerknemerUitbreiding(freelancer);

        System.out.println("Taken van een freelancer die teamleider is: ");
        freelancerTeamleider.geefTaken();
        System.out.println();

        Werknemer freelancer2 = new Freelancer();
        Werknemer freelancerVoorzitter = new VoorzitterWerknemerUitbreiding(freelancer2);


        System.out.println("Taken van een freelancer die voorzitter is: ");
        freelancerVoorzitter.geefTaken();
        System.out.println();


    }
}
