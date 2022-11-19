# Quiz_App
**This is science quiz app having a total of 30 Questions, made using Kotlin.**  

## App Screenshot
<p float="left">
  <img src="https://i.postimg.cc/8Cp7trw6/Screenshot-2022-11-18-15-19-32-830-com-example-adi-quizapp.jpg" width="150" alt="Quiz app filter" >    
  <img src="https://i.postimg.cc/J4RG52xh/Screenshot-2022-11-18-15-34-33-385-com-example-adi-quizapp.jpg" width="150" alt="Quiz app filter" >
  <img src="https://i.postimg.cc/k4jhYZ8d/Screenshot-2022-11-18-15-34-40-744-com-example-adi-quizapp.jpg" width="150" alt="Quiz app filter" >
  <img src="https://i.postimg.cc/Zq5QP4BL/Screenshot-2022-11-18-15-34-54-254-com-example-adi-quizapp.jpg" width="150" alt="Quiz app filter" >
  <img src="https://i.postimg.cc/FsbC270Z/Screenshot-2022-11-18-15-35-10-850-com-example-adi-quizapp.jpg" width="150" alt="Quiz app filter" >
  <img src="https://i.postimg.cc/jSdcmvxx/Screenshot-2022-11-18-15-35-27-239-com-example-adi-quizapp.jpg" width="150" alt="Quiz app filter" >
  <img src="https://i.postimg.cc/bY9QPbFs/Screenshot-2022-11-18-15-36-47-680-com-example-adi-quizapp.jpg" width="150" alt="Quiz app filter" >
</p>

## Implemented Feature
  - This app have three activities-
      1. First one is for user to input his/her name and start the quiz,
      2. Second one is for displaying questions to the user and for user to choose the correct option,
      3. And the third one is for displaying the result of the quiz.
  - In the first activity we have a `TextInputLayout` and this layout contains an `AppCompatEditText` instead of a normal `EditText` this is because it makes the app more user interactive, this activity also contains an elevated `CardView` to give some 3D touch to the app.  
  - The second activity has a `TextView` for displaying the question to the user, below it is an `ImageView` containing an image related to the question then a horizontal `ProgressBar` for displaying the number of questions answered and then their are four `TextView`s displaying the four different options from which user can select any one option by clicking on it, when an option is choosen by the user it creates a purple boundary around that option to make sure that it's selected, user can also choose any other option by simply clicking on it then at the end is a submit button which user can select to see if the answer was correct or not.
  - The third and the last activty is for displaying the result of the quiz on a `CardView`
    
## Download APK
