package com.mtw.caballero.datatimepickers


import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.TimePicker
import android.app.TimePickerDialog
import android.app.DialogFragment
import java.util.*
import android.text.format.DateFormat


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {


    override fun onCreateDialog(savedInstanceState: Bundle): Dialog {
        // Use the current time as the default values for the picker.
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        // Create a new instance of TimePickerDialog and return it.
        return TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()))
    }


    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {

        val activity = getActivity() as MainActivity
        activity.processTimePickerResult(hourOfDay, minute)

    }
}
