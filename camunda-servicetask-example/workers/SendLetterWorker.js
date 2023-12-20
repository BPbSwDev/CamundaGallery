import { Client, Variables, logger } from "camunda-external-task-client-js";

// configuration for the Client:
//  - 'baseUrl': url to the Process Engine
//  - 'logger': utility to automatically log important events
const config = { baseUrl: "http://localhost:8080/engine-rest", use: logger };

// create a Client instance with custom configuration
const client = new Client(config);

// susbscribe to the topic: 'SendLetter'
client.subscribe("SendLetter", async function({ task, taskService }) {

    const bookTitle = task.variables.get("book");
    console.log("** Reminder to Read: "+ bookTitle + "**");

    const austriaResponse = "Sorry Laff can't help, BTW. Prussia wants a quick word with you.."
    const processVariables = new Variables();

    processVariables.set("austriaResponse", austriaResponse);
    // complete the task
  await taskService.complete(task, processVariables);
});