package PktActividad8;

public class ClsNota {
	 public int MtdPromedio(int notaParcial1, int notaParcial2, int notaParcial3, int notaLaboratorio1, int notaLaboratorio2, int notaLaboratorio3, int notaSemestral)  {
	        float porcentajeParciales = (notaParcial1+notaParcial2+notaParcial3)*30/300;
	        float porcentajeLaboratorios = (notaLaboratorio1+notaLaboratorio2+notaLaboratorio3)*35/300;
	        float porcentajeSemestral = (float) (notaSemestral*0.35);
	        int sumaPorcentajes = (int) (porcentajeParciales+porcentajeLaboratorios+porcentajeSemestral);

	        return sumaPorcentajes;
	    }

	    public static char MtdNota(int porcentajeTotal) {
	        if (porcentajeTotal<=60)
	            return 'F';
	        else
	        {
	            if (porcentajeTotal<=70)
	                return 'D';
	            else
	            {
	                if (porcentajeTotal<=80)
	                    return 'C';
	                else
	                {
	                    if (porcentajeTotal<=90)
	                        return 'B';
	                    else
	                        return 'A';
	                }
	            }
	        }
	    }
	   
	}