# _Team Tracker_

#### _Team Tracker, 03-24-2017_

#### By _**Taylor Loftis-Kim**_

## Description
_This is an Application that Event Coordinators/Administrators can use to keep track of Teams and Team Members. Multiple Teams can be added to the Roster, as well Team Members. _


## Specifications

| Behavior                                | Input                         | Output                             |
|-----------------------------------------|-------------------------------|------------------------------------|
| Will return instance of a team          | "Epicoders"                   | "Epicoders"                        |
| Will return all instances of Teams      | "Epicoders", "C Shapers"      | "Epicoders", "C Shapers"           |
| Will clear List of Teams                | "Epicoders" --> Team.clear(); | *List Cleared                      |
| Will instantiate each Team with an ID   | "Epicoders", "C Sharpers"     | 1, 2                               |
| Will return Team with Same ID           | "C Shapers"                   | 2                                  |
| Will add a Member to Team               | "Taylor"                      | Team: "Epicoders" Member: "Taylor" |
| Will return instance of a member        | "Taylor"                      | "Taylor"                           |
| Will return all instance of Members     | "Taylor", "Mike"              | "Taylor", "Mike"                   |
| Will clear List of Members              | "Taylor" --> Member.clear()   | *List Cleared                      |
| Will instantiate each Member with an ID | "Taylor", "Mike"              | 1, 2                               |
| Will return Member with same ID         | "Mike"                        | 1                                  |



## Setup/Installation Requirements

* _Clone the repository_
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_

### License

Copyright (c) 2017 **_Taylor Loftis-Kim_**

This software is licensed under the MIT license.
