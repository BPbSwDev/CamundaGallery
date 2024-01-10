import { Client, Variables, logger } from "camunda-external-task-client-js";

// configuration for the Client:
//  - 'baseUrl': url to the Process Engine
//  - 'logger': utility to automatically log important events
const config = { baseUrl: "http://localhost:8080/engine-rest", use: logger };

// create a Client instance with custom configuration
const client = new Client(config);

// susbscribe to the topic: 'pagoNequi'
client.subscribe("pagoNequi", async function({ task, taskService }) {

    const tipoTransaccion = task.variables.get("tipoTransaccion");
    const valorTransaccion = task.variables.get("valorTransaccion");


    console.log("** PAGO REALIZADO " +
        "info: \nmedio de pago:"+ tipoTransaccion + "\nvalor:"+valorTransaccion);

    const status = "Pago efectuado"
    const processVariables = new Variables();

    processVariables.set("status", status);
    // complete the task
  await taskService.complete(task, processVariables);
});