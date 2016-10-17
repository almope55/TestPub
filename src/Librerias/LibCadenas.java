/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librerias;

/**
 *
 * @author almope
 */
public class LibCadenas {
    public static boolean isStringNumber(String number){
        if(number!=null){
            //Si el string se puede convertir a numero retorna true
            // {-,0,1,2,3,4,5,6,7,8,9}
            try{
                Float.parseFloat(number);
                return true;
            }catch(Exception ex){
                // si el string no se puede convertir a numero retorna false
                return false;
            }
        }
        return false;
    }


    public String[] IdNombre(String cadena){
        String CadenaIdNom[] = new String[2];
        String idX;
        int lg = cadena.length();
        int px = cadena.indexOf(",");
        if(px > -1){//-1 Si no Existe
            idX = cadena.substring(0, px);
            //if(isStringNumber(idX)){
            //    CadenaIdNom[0] = idX;
            //}else{
            //    CadenaIdNom[0] = "0";
            //}
            CadenaIdNom[0] = idX;

        }else {
            CadenaIdNom[0] = "0";
        }

        String cad = cadena.substring(px+1, lg);
        CadenaIdNom[1] = cad;
        return CadenaIdNom;
    }
}
