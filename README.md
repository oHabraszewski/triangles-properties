# Triangles properties
Triangle properties is a simple mathematic program.
It allows creating triangles based on data provided by user then displays full data regarding this triangle 
e.g. lengths of its sides, measures of its angles.

### Requirements

- Installed Java 8 on your computer
- Really basic requirements, come on, it's just a static GUI application ;)

## Usage

Download it from here: *link to the latest stable version (Will be available after first release)*  

Start it like any other program, so you can double-click its icon or run by a command:
```shell script
java -jar *filename*.jar
```

## Mathematics behind the project

Following mathematical stuff was used during development:

- Radians as unit of measures for angles
  - Conversion from degrees to radians,
    - Using constant number PI,
  - All trigonometry functions calculated from radians,
- Trigonometry functions
  - Sine and cosine for Section constructor based on Point, Angle and length of section,
  - Tangent for Straight constructor based on Point and Angle,
- Pythagorean theorem
  - For lengths of Sections calculation in Triangle based on two Points,
- Linear function
  - Used to find cross point between two Straights to create Triangle from side and two angles,

## Technology behind the project

Libraries, frameworks and languages required to bring this project to life:

- Java 8
- JavaFX
  - FXML-based GUI design
- JUnit 5
- Maven
- Git
