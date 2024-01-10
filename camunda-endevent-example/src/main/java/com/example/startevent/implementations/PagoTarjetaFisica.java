package com.example.startevent.implementations;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("pagoTarjeta")
public class PagoTarjetaFisica implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long valorTransaccion = (Long) delegateExecution.getVariable("valorTransaccion");

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("******** PAGO REALIZADO CON TARJETA FÍSICA ********");
        System.out.println("Fecha: "+formattedDate);
        System.out.println("Código: DA552");
        System.out.println("Valor: "+valorTransaccion);
    }
}
