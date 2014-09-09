package com.tencent.mm.ui.setting;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cu;

public class EditSignatureUI extends MMActivity
{
  private TextView hqI;
  private EditText jLq;

  private static int v(CharSequence paramCharSequence)
  {
    return 30 - Math.round(w(paramCharSequence));
  }

  private static float w(CharSequence paramCharSequence)
  {
    float f = 0.0F;
    int i = 0;
    if (i < paramCharSequence.length())
    {
      if (ap.l(paramCharSequence.charAt(i)));
      for (f += 1.0F; ; f += 0.5F)
      {
        i++;
        break;
      }
    }
    return f;
  }

  protected final void DP()
  {
    oP(n.cgU);
    this.jLq = ((EditText)findViewById(i.content));
    this.hqI = ((TextView)findViewById(i.baa));
    String str = ap.ja((String)bg.qW().oQ().get(12291));
    this.jLq.setText(str);
    this.jLq.setSelection(this.jLq.getText().length());
    this.hqI.setText(v(this.jLq.getEditableText()));
    EditText localEditText = this.jLq;
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new e(this);
    localEditText.setFilters(arrayOfInputFilter);
    this.jLq.addTextChangedListener(new f(this, (byte)0));
    a(new c(this));
    a(0, getString(n.bud), new d(this), cu.iMA);
    eB(false);
  }

  protected final int getLayoutId()
  {
    return k.bek;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
      finish();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.EditSignatureUI
 * JD-Core Version:    0.6.2
 */