package com.tencent.mm.ui.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class d
  implements TextWatcher
{
  private final int doC;
  private EditText fGo;
  private TextView kaO;
  private c kaP = null;
  private boolean kaQ = false;

  public d(EditText paramEditText, TextView paramTextView, int paramInt)
  {
    this.fGo = paramEditText;
    this.kaO = paramTextView;
    this.doC = paramInt;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    String str1 = paramEditable.toString();
    String str2 = "";
    int i = 0;
    int j = 0;
    if (j < str1.length())
    {
      if (ch.l(str1.charAt(j)))
        i += 2;
      while (true)
      {
        if (i > this.doC)
          break label83;
        str2 = str2 + str1.charAt(j);
        j++;
        break;
        i++;
      }
    }
    label83: if (i > this.doC);
    try
    {
      this.fGo.setText(str2);
      if (!this.kaQ)
      {
        int n = this.fGo.getText().toString().length();
        this.fGo.setSelection(n);
      }
      while (true)
      {
        this.kaQ = false;
        k = this.doC - i;
        m = 0;
        if (k >= 0)
          break;
        if (this.kaO != null)
          this.kaO.setText(m / 2);
        return;
        this.fGo.setSelection(0);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int k;
        this.kaQ = true;
        String str3 = localException.getMessage();
        z.e("!32@/B4Tb64lLpKIBwYy27eZfJEyh0MS+Du5", "error " + str3);
        this.fGo.setText(str2);
        this.fGo.setSelection(0);
        continue;
        int m = k;
      }
    }
  }

  public final void b(c paramc)
  {
    this.kaP = paramc;
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.kaP != null)
      this.kaP.afm();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.d
 * JD-Core Version:    0.6.2
 */