package com.polytech.tp;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;
import com.polytech.tp.ICours;
import com.polytech.tp.GestionnaireEmploiDuTemps;
import com.polytech.tp.Etudiant;
import com.polytech.tp.Responsable;
import com.polytech.tp.CoursEnLigne;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cours c = new CoursBuilder()
        .setMatiere("Génie Logiciel")
        .setEnseignant("Mr Harbi")
        .setSalle("info6")
        .setDate("2025-11-20")
        .setHeureDebut("15:00")
        .setEstOptionnel(false)
        .setNiveau("2")
        .setNecessiteProjecteur(true)
        .build();
    c.getDescription();
    GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

    Etudiant e1 = new Etudiant("khouloud");
    Responsable r1 = new Responsable("Prof");

    gestionnaire.attach(e1);
    gestionnaire.attach(r1);

    ICours cours = new CoursBuilder().setMatiere("Génie Logiciel").build();
    gestionnaire.ajouterCours(cours,"messaaaage");
    gestionnaire.modifierCours(cours, "Salle changée");
    ICours cours1 = new CoursBuilder()
    .setMatiere("Génie Logiciel")
    .setSalle("amphi4") // ajoute la durée dans le builder
    .build();

ICours coursEnLigne = new CoursEnLigne(cours1);


System.out.println(cours1.getDescription());                // Génie Logiciel
System.out.println(coursEnLigne.getDescription());        // Génie Logiciel (En ligne)
}
}
    

