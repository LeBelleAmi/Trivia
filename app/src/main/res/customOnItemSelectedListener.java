import android.widget.AdapterView;

/**
 * Created by HP on 29-May-17.
 */

public class customOnItemSelectedListener implements AdapterView.OnItemSelectedListener{
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
String item = parent.getItemAtPosition(pos).toString();
        // An item was selected. you can retrieve the selected item using
        // parent.getItemAtPostion (pos)
    }


    public void onNothingSelected(AdapterView<?> parent){
        // Do nothing
    }

}
