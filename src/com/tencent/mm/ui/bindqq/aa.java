package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.as;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class aa
  implements DialogInterface.OnClickListener
{
  aa(z paramz)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    StartUnbindQQ.a(this.jll.jlk, StartUnbindQQ.c(this.jll.jlk).getText().toString());
    StartUnbindQQ.c(this.jll.jlk).setText("");
    StartUnbindQQ.c(this.jll.jlk).clearFocus();
    this.jll.jlk.ak(StartUnbindQQ.c(this.jll.jlk));
    if ((StartUnbindQQ.d(this.jll.jlk) == null) || (StartUnbindQQ.d(this.jll.jlk).equals("")))
    {
      e.a(this.jll.jlk, n.cnK, n.buo, null);
      return;
    }
    as localas = new as(2, StartUnbindQQ.d(this.jll.jlk), "", "", "");
    bg.qX().d(localas);
    StartUnbindQQ localStartUnbindQQ1 = this.jll.jlk;
    StartUnbindQQ localStartUnbindQQ2 = this.jll.jlk;
    this.jll.jlk.getString(n.buo);
    StartUnbindQQ.a(localStartUnbindQQ1, e.a(localStartUnbindQQ2, this.jll.jlk.getString(n.ceV), true, null));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.aa
 * JD-Core Version:    0.6.2
 */