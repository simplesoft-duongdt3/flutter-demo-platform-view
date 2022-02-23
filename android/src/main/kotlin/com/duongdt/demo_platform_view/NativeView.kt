package android.src.main.kotlin.com.duongdt.demo_platform_view

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import io.flutter.plugin.platform.PlatformView

internal class NativeView(context: Context, id: Int, creationParams: Map<String?, Any?>?) : PlatformView {
    private val rootView: View

    override fun getView(): View {
        return rootView
    }

    override fun dispose() {}

    init {
        rootView = LinearLayout(context)
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        layoutParams.gravity = Gravity.CENTER
        rootView.layoutParams = layoutParams
        rootView.orientation = LinearLayout.VERTICAL
        rootView.setBackgroundColor(Color.GREEN)

        val textView1 = TextView(context)
        textView1.textSize = 72f
        textView1.text = "Rendered on a native Android view (id: $id)"

        rootView.addView(textView1);

        val groupButton = LinearLayout(context)
        groupButton.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        groupButton.orientation = LinearLayout.HORIZONTAL

        val buttonOk = Button(context)
        buttonOk.text = "OK"
        buttonOk.setOnClickListener {
            textView1.text = "OK: Rendered on a native Android view (id: $id)"
        }
        groupButton.addView(buttonOk)

        val buttonCancel = Button(context)
        buttonCancel.text = "Cancel"
        buttonCancel.setOnClickListener {
            textView1.text = "Cancel: Rendered on a native Android view (id: $id)"
        }
        groupButton.addView(buttonCancel)

        rootView.addView(groupButton)
    }
}