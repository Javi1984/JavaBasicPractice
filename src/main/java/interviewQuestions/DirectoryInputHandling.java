package interviewQuestions;

public class DirectoryInputHandling {

    public String getFinalPath(String[] commands) {
        String rtnString = "";
        for(int i = 0; i < commands.length; i++){
            String fullCommand = commands[i];
            String command = fullCommand.substring(3);
            switch(command){
                case "/":
                    rtnString = "/";
                    break;
                case ".":
                    break;
                case "..":
                    if(!rtnString.isEmpty()){
                        //rtnString = rtnString.substring(rtnString.lastIndexOf("/"));
                        rtnString = rtnString.substring(0,rtnString.lastIndexOf("/"));
                    }
                    break;
                default:
                    rtnString += "/" + command;
            }
        }

        return rtnString;
    }
}
