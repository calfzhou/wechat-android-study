package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.tools.av;

final class b
  implements View.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    View localView = View.inflate(a.a(this.hGV), k.bmO, null);
    ((TextView)localView.findViewById(i.aOv)).setVisibility(8);
    TextView localTextView = (TextView)localView.findViewById(i.baa);
    localTextView.setVisibility(0);
    localTextView.setText("50");
    EditText localEditText = (EditText)localView.findViewById(i.aOu);
    localEditText.setSingleLine(false);
    localEditText.setFilters(av.hLZ);
    localEditText.addTextChangedListener(new c(this, localTextView));
    com.tencent.mm.ui.base.e.a(a.a(this.hGV), a.a(this.hGV).getString(n.bua), localView, new d(this, localEditText), null);
    localEditText.post(new e(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.b
 * JD-Core Version:    0.6.2
 */