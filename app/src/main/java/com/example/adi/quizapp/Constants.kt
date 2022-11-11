package com.example.adi.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions> {
        val questions = ArrayList<Questions>()

        val q1 = Questions(1, "Who invented the telescope?",
            R.drawable.ic_telescope, "Newton", "Copernicus", "Galileo", "Pythagoras", 3)
        questions.add(q1)

        val q2 = Questions(2, "Which phenomenon is responsible for the blue colour of sky?",
            R.drawable.ic_sky, "Scattering", "Dispersion", "Refraction", "Reflection", 1)
        questions.add(q2)

        val q3 = Questions(3, "Which among the following is a Noble Gas?",
            R.drawable.ic_atom, "Nitrogen", "Hydrogen", "Oxygen", "Helium", 4)
        questions.add(q3)

        val q4 = Questions(4, "Change in genetic composition of a population is called as?",
            R.drawable.ic_fingerprint, "Extinction", "Evolution", "Endemic", "Vicariance", 2)
        questions.add(q4)

        val q5 = Questions(5, "Any disease which has a name with a suffix encephalitis is a disorder of _______.",
            R.drawable.ic_human, "Nerves", "Brain", "Lungs", "Heart", 2)
        questions.add(q5)

        val q6 = Questions(6, "Who put forward the “Theory of Evolution?",
            R.drawable.ic_evolution, "Aristotle", "Darwin", "Louis Pasteur", "Newton", 2)
        questions.add(q6)

        val q7 = Questions(7, "A body weight 100kg would not be zero at which of the following?",
            R.drawable.ic_weight, "Earth's centre", "Free fall", "Lift", "Space", 3)
        questions.add(q7)

        val q8 = Questions(8, "Pneumonia is an infection of _______.",
            R.drawable.ic_pneumonia, "Nerve", "Blood", "Skin", "Lungs", 4)
        questions.add(q8)

        val q9 = Questions(9, "Which of the following have maximum ionisation potential?",
            R.drawable.ic_ionisation, "Mg", "Si", "P", "Al", 3)
        questions.add(q9)

        val q10 = Questions(10, "What type of waves are light waves?",
            R.drawable.ic_light, "Transverse", "Longitudinal", "Both", "None", 1)
        questions.add(q10)

        val q11 = Questions(11, "Which of the following have zero dipole moment?",
            R.drawable.ic_dipole, "NH3", "NF3", "BF3", "None", 3)
        questions.add(q11)

        val q12 = Questions(12, "Ribosomes are site for _______.",
            R.drawable.ic_ribosomes, "Protein synthesis", "Photosynthesis", "Fat synthesis", "Respiration", 1)
        questions.add(q12)

        val q13 = Questions(13, "A passenger in a moving bus is thrown forward when the bus suddenly stops, this is explained by _______.",
            R.drawable.ic_newton, "Newton's first law", "Newton's second law", "Newton's third law", "None", 1)
        questions.add(q13)

        val q14 = Questions(14, "Which of the following organism breathes from skin?",
            R.drawable.ic_breath, "Snake", "Earthworm", "Monkey", "Humans", 2)
        questions.add(q14)

        val q15 = Questions(15, "Which of the following shows similarity to a prokaryotic cell?",
            R.drawable.ic_prokariotic, "Mitochondria", "Chloroplast", "Both", "None", 3)
        questions.add(q15)

        val q16 = Questions(16, "At which point on Earth gravity is zero?",
            R.drawable.ic_earth_core_mantle_crust, "Poles", "Equator", "Ocean surface", "Centre", 4)
        questions.add(q16)

        val q17 = Questions(17, "Which of the following helps in the blood clotting?",
            R.drawable.ic_bloodclot, "Vitamin A", "Vitamin B", "Vitamin K", "Folic acid", 3)
        questions.add(q17)

        val q18 = Questions(18, "Which of the following is not based on the heating effect of current?",
            R.drawable.ic_heatingeffect, "Electric heater", "Electric bulb", "Electric iron", "Microwave", 4)
        questions.add(q18)

        val q19 = Questions(19, "The cell wall of a plant is composed of _______.",
            R.drawable.ic_plantcell, "Cellulose", "Carbohydrate", "Lipids", "Lipoprotein", 1)
        questions.add(q19)

        val q20 = Questions(20, "Which of the following gas is reduced in the reduction process?",
            R.drawable.ic_reduction, "Oxygen", "Helium", "Carbon", "Hydrogen", 4)
        questions.add(q20)

        val q21 = Questions(21, "What is the S.I unit of frequency?",
            R.drawable.ic_frequency, "Diopter", "Second", "Hertz", "Meter", 3)
        questions.add(q21)

        val q22 = Questions(22, "Acid turns blue litmus paper into which color?",
            R.drawable.ic_litmus, "Black", "Blue", "Red", "Orange", 3)
        questions.add(q22)

        val q23 = Questions(23, "Which of the following enzymes is not present in the human stomach?",
            R.drawable.ic_stomach, "Pepsin", "HCL", "Mucus", "Trypsin", 4)
        questions.add(q23)

        val q24 = Questions(24, "Which of the following gland is present in the human mouth?",
            R.drawable.ic_mouth, "Adrenal", "Pituitary", "Gonads", "Salivary", 4)
        questions.add(q24)

        val q25 = Questions(25, "What is the other name of Newton's first law of motion?",
            R.drawable.ic_firstlaw, "Action-reaction", "Change in momentum", "Law of inertia", "Constant momentum", 3)
        questions.add(q25)

        val q26 = Questions(26, "Name the part of the body on which coronavirus affects the most?",
            R.drawable.ic_virus, "Heart", "Liver", "Kidney", "Lungs", 4)
        questions.add(q26)

        val q27 = Questions(27, "According to Newton's second law of motion, change in momentum per unit time is equal to _______.",
            R.drawable.ic_newton_pic, "Force", "Energy", "Acceleration", "Work", 1)
        questions.add(q27)

        val q28 = Questions(28, "What is the color of SO2 gas?",
            R.drawable.ic_cylinder, "Blue", "Grey", "Colorless", "Brown", 3)
        questions.add(q28)

        val q29 = Questions(29, "How many carbon atoms are present in heptane?",
            R.drawable.ic_carbonchain, "6", "7", "8", "5", 2)
        questions.add(q29)

        val q30 = Questions(30, "What is the atomic number of phosphorus?",
            R.drawable.ic_atomicnumber, "12", "13", "14", "15", 4)
        questions.add(q30)

        return questions
    }
}