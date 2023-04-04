package Tools;

import Entities.Exo1.Cours;
import Entities.Exo1.CoursCollectif;
import Entities.Exo1.CoursIndividuel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] colonnes;
    private Object[][] lignes;


    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasCours(ArrayList<Cours> uneDescription) {

        // A compléter ici
            {
                colonnes = new String[]{"Description","Prix"};
                lignes = new Object[uneDescription.size()][2];
                int i = 0;

                for(Cours cour : uneDescription) {
                    lignes[i][0] = cour.getIdCours();
                    lignes[i][1] = cour.getPrix();
                    if (cour instanceof CoursCollectif)
                    /*{
                        lignes[i][2] =  cour();
                        lignes[i][3] =  ((CoursCollectif) cour).GetLargeur();
                        lignes[i][4] =  ((CoursCollectif) cour).GetLongueur();
                    }
                    else if(sport instanceof SportRelais)
                    {
                        lignes[i][2] =  sport.GetDescription();
                        lignes[i][3] =  "";
                        lignes[i][4] =  "";
                        lignes[i][5] =  ((SportRelais) sport).getDistance();
                    }
                    else
                    {
                        lignes[i][2] =  sport.GetDescription();
                        lignes[i][3] =  "";
                        lignes[i][4] =  "";
                        lignes[i][5] =  "";
                    }

                    i++;
                }*/
                        fireTableChanged(null);
                }
            }

    }
}
