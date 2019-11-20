
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Junisses Campos
 */

public interface Descontable {
    final double IVA = 0.19;
    final double DESCMOTO = 0.30;
    final double DESCSEDHASH =0.15;
    final double DESCSUV = 0.10;
    final double DESCAMION = 0.05;
    final double VALOR = 20;
    double obtenerPagarEstacionamiento();
    double descontar();
    double obtenerTotalFinal();
}
