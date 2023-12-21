import { Client, Variables, logger } from "camunda-external-task-client-js";

// configuration for the Client:
//  - 'baseUrl': url to the Process Engine
//  - 'logger': utility to automatically log important events
const config = { baseUrl: "http://localhost:8080/engine-rest", use: logger };

// create a Client instance with custom configuration
const client = new Client(config);

// susbscribe to the topic: 'SendLetter'
client.subscribe("SendLetter", async function({ task, taskService }) {

    const email = task.variables.get("email");
    const content = task.variables.get("content")
    const comments = task.variables.get("comments")

    console.log("** Tweet ar" +
        "info: \nemail:"+ email + "\ncontent:"+content+"\ncomments: "+comments+"**");

    const status = "Tweet rejected"
    const processVariables = new Variables();

    processVariables.set("status", status);
    // complete the task
  await taskService.complete(task, processVariables);
});