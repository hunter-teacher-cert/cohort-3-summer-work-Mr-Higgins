// BIG IDEA: Searching for particular value in a given array.
// Trying to find values of interest/indices.
//STUDENT PROMPT (Mild): Read the code below, make a prediction as to what this code will do? What is the output? Do you recognize //any of the syntax we've learned from prior lessons?
// PROVIDE Class name, etc.
// STUDENT PROMPT (Spicy): What would the parameters/arguments
// to search for a value in a list?
// STUDENT PROMPT (Mild): What purpose do value and data
// serve?
public int linearSearch(int value, ArrayList<Integer> data) {
  // REVISION: Can we upgrade this to return ALL indices
  // where this value appears?
  
  // STUDENT PROMPT/MUST-ANSWER-Q: What would be a good
  // value to initialize foundIndex to?
  int foundIndex = -1; // initializes intiger variable with negative 1, 
  int element;
  
  for (int i=0; i < data.size(); i++) {
    element = data.get(i);

    //REVISION: Drop element/e use data.get(i) instead.
    if (e == value) { // DELIBERATE-ERROR
      foundIndex = i;
      break;
      }
    }
  return foundIndex;
}

// BEEG REVEAL: ArrayList.indexOf() already handles this
// functionality.