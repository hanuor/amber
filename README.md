# amber    
-----
#####Power your app's data links with named entity recognition and disambiguation. 
#####Entity Linking  Sometimes in different contexts, a word might be used as a named entity, a verb, or another word form within a given sentence. For example, in the case where “times” is a named entity, it still may refer to two separately distinguishable entities, such as “The New York Times” or “Times Square”.       
#####For example, if this is an input paragraph       
       
       For months, the four scientific instruments at the heart of the James Webb Space Telescope have been sealed in what looks like a huge pressure cooker.
       It's a test chamber that simulates the grueling operating conditions they will face after Webb is launched into orbit in 2018.
       But in fact, "pressure cooker" is an apt metaphor for the whole project. The infrared Webb observatory is the biggest, most complex, and most expensive science mission that NASA has ever attempted.
       Like that of its predecessor, the Hubble Space Telescope, Webb's construction has been plagued by redesigns, schedule slips, and cost overruns that have strained relationships with contractors, international partners, and supporters in the U.S. Congress.
       Lately the project has largely stuck to its schedule and its $8 billion budget.
       But plenty could still go wrong, and the stakes are high: Both the future of space-based astronomy and NASA's ability to build complex science missions depend on its success.

#####Then after intelligent entity linking the library would fetch only the starred words:       

       For months, the four scientific instruments at the heart of the **James Webb Space Telescope** have been sealed in what looks like a huge pressure cooker.
       It's a test chamber that simulates the grueling operating conditions they will face after **Webb** is launched into orbit in 2018.
       But in fact, "pressure cooker" is an apt metaphor for the whole project. The infrared **Webb** observatory is the biggest, most complex, and most expensive science mission that **NASA** has ever attempted.
       Like that of its predecessor, the Hubble Space Telescope, Webb's construction has been plagued by redesigns, schedule slips, and cost overruns that have strained relationships with contractors, international partners, and supporters in the **U.S. Congress**.
       Lately the project has largely stuck to its schedule and its $8 billion budget.
       But plenty could still go wrong, and the stakes are high: Both the future of space-based astronomy and NASA's ability to build complex science missions depend on its success.       

#####The return would be as follows:
       James Webb Space Telescope
       NASA
       Hubble Space Telescope
       United States
       United States Congress       
       
#####You can learn more about entity linking, visit this link: https://en.wikipedia.org/wiki/Entity_linking 
------    
#Download    
###Using Gradle, under the dependencies section:       


    compile 'com.github.hanuor:amber:1.0.0'           
    
	

### or Using Maven:      

    <dependency>
    <groupId>com.github.hanuor</groupId>
    <artifactId>amber</artifactId>
    <version>1.0.0</version>
    <type>pom</type>
    </dependency>       

### or Using Ivy:         
    <dependency org='com.github.hanuor' name='amber' rev='1.0.0'>
    <artifact name='$AID' ext='pom'></artifact>
    </dependency>        
	 

------
#Documentation

###Getting linked entities and their relevant wikipedia id/name 
Pretty simple -        

      Amber.with(MainActivity.this).load("Whatever the paragraph/ sentence/ string you want to analyze")
                .call(new OnTaskCompletion() {
                    @Override
                    public void onComplete(ArrayList<PairHelper> response) {
                        for(int i =0; i< response.size(); i++){
                            String wicked = response.get(i).getWikiName();
                            String normal = response.get(i).getName();
                            //Do whatever you want to do here
                        }
                    }
                });

		

------
###Compatibility

**Minimum Android SDK**: Amber requires a minimum API level of **7**.      

     
----------      
 
 **Please do notify us if you're using our library in your app. We'd be more than happy to list your app here!**    
-----------     
---------

###License
Copyright 2016 Hanuor, Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
