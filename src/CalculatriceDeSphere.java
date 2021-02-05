import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatriceDeSphere
{
    private static final double PI = 3.1416;

    public static void main(String[] args)
    {
        /*  Un programme qui lit le rayon d'une sphère puis qui calcule et
        affiche son volume et son aire à l’écran. */
        String rayonSaisie = null;
        try
        {
            rayonSaisie = JOptionPane.showInputDialog("Entrez le rayon de la sphère: ");
            double rayon = Double.parseDouble(rayonSaisie);
            double volume = calculerLeVolumeDeLaSphere(rayon);
            double aire = calculerLeVolumeDeLaire(rayon);

            // arrondir le nombre (le volume) à 2 chiffres après le point
            BigDecimal arrondirVolume = new BigDecimal(volume);
            volume = arrondirVolume.setScale(2, RoundingMode.HALF_UP).doubleValue();

            // arrondir le nombre (l'aire) à 2 chiffres après le point
            BigDecimal arrondirAire = new BigDecimal(aire);
            aire = arrondirAire.setScale(2, RoundingMode.HALF_UP).doubleValue();

            System.out.println("Le rayon de la sphère est: " + rayonSaisie);
            System.out.println("Le volume de la sphère est: " + String.format("%.2f", volume));
            System.out.println("L'aire de la sphère est: "  + String.format("%.2f", aire));
        } catch(Exception exception) {
            JOptionPane.showMessageDialog(
                    null,
                    "La valeur entrée pour le rayon: '" + rayonSaisie + "' n'est pas valide. Ce devrait être une valeur numérique.");
        }

        System.exit(0);
    }

    private static double calculerLeVolumeDeLaSphere(double rayon)
    {
        double volume = 0.0;
        try
        {
            volume = ((double) 4 / 3) * (PI * Math.pow(rayon, 3));
        } catch (Exception exception) {
            throw exception;
        }

        return volume;
    }

    private static double calculerLeVolumeDeLaire(double rayon)
    {
        double aire = 0.0;
        try
        {
             aire = ((double) 4 * PI) * (Math.pow(rayon, 2));
        } catch (Exception exception) {
            throw exception;
        }

        return aire;
    }
}




