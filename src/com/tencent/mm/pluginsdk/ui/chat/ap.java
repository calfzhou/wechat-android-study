package com.tencent.mm.pluginsdk.ui.chat;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.ui.widget.MMEditText;

public final class ap
  implements TextWatcher
{
  TextWatcher hDZ;
  private boolean hEa = false;
  private boolean hEb = j.cq(11);

  public ap(ChatFooter paramChatFooter, TextWatcher paramTextWatcher)
  {
    this.hDZ = paramTextWatcher;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i = 1;
    if ((ChatFooter.f(this.hDT)) && (this.hEb) && (this.hEa) && (paramEditable.length() > 0))
    {
      this.hEa = false;
      ChatFooter.a(this.hDT).setText(paramEditable.subSequence(0, -1 + paramEditable.length()));
      if (ChatFooter.a(this.hDT).length() > 0)
        ChatFooter.g(this.hDT).performClick();
      return;
    }
    this.hDZ.afterTextChanged(paramEditable);
    if (ChatFooter.q(this.hDT) != null)
    {
      if (ChatFooter.a(this.hDT).getLineCount() > i)
      {
        ChatFooter.q(this.hDT).setVisibility(0);
        ChatFooter.q(this.hDT).setText(paramEditable.length() + "/140");
      }
    }
    else
      label169: if ((paramEditable.length() <= 0) || (paramEditable.toString().trim().length() <= 0))
        break label246;
    while (true)
    {
      ChatFooter.b(this.hDT, i);
      if ((ChatFooter.p(this.hDT) == null) || (ChatFooter.p(this.hDT) == null))
        break;
      ChatFooter.p(this.hDT).de(i);
      return;
      ChatFooter.q(this.hDT).setVisibility(8);
      break label169;
      label246: int j = 0;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.hDZ.beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((ChatFooter.f(this.hDT)) && (this.hEb) && (paramInt2 == 0) && (paramInt1 == -1 + paramCharSequence.length()) && (paramInt3 == 1) && (paramCharSequence.charAt(-1 + paramCharSequence.length()) == '\n'))
    {
      this.hEa = true;
      return;
    }
    this.hDZ.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ap
 * JD-Core Version:    0.6.2
 */