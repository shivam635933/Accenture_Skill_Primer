function checkAlliteration(){ 
    try{ 
        var char = document.getElementById("char").value.trim().toLowerCase(); 
        var sentence = document.getElementById("alliter").value.trim().toLowerCase(); 
        
        if (getCount(sentence)<3){ 
            document.getElementById("result").innerHTML="Invalid number of words"; 
            return; 
        } 
        
        if (!validateSentence (sentence)) { 
            document.getElementById("result").innerHTML="Invalid sentence"; 
            return; 
        } 
        
        var score = getScore(sentence, char); 
        document.getElementById("result").innerHTML="Your score is "+score; 
        
        return false; 
    }catch(err){ 
    document.getElementById("result").innerHTML="Function checkAlliteration: "+err; 
    } 
} 

function getCount(str){ 
    try{ 
        var words = str.split(/\s+/); 
        return words.length; 
    }catch(err){ 
        document.getElementById("result").innerHTML="Function getCount: "+err; 
    } 
}

function validateSentence(str){ 
    try{ 
        var words = str.split(/\s+/); 
        
        for(var i=0;i<words.length;i++) 
            if('aeiou'.indexOf(words[i].charAt(0)) != -1) 
                return false; 

        return true; 
    }catch(err){ 
        document.getElementById("result").innerHTML="Function validateSentence: "+err; 
    } 
} 

function getScore(str,char) { 
    try{ 
        var score = 0; 
        var words = str.split(/\s+/); 
        
        for(var i=0;i<words.length;i++) { 
            if(words[i].charAt(0) != char){ 
                score=0 
                return score; 
            } 
            else{ 
                if(i<=2) 
                    score=2; 
                else 
                    score+=2;
            }
        }
        return score;
    }catch(err){ 
        document.getElementById("result").innerHTML="Function validateSentence: "+err; 
    }
}