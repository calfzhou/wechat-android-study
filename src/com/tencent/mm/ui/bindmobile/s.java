package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.platformtools.ac;
import com.tencent.mm.storage.e;

final class s
  implements View.OnClickListener
{
  s(BindMContactIntroUI paramBindMContactIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (BindMContactIntroUI.b(this.jka) == ab.dtT)
    {
      bg.qW().oQ().set(12322, Boolean.valueOf(false));
      ac.a(this.jka, new t(this), true);
      return;
    }
    Intent localIntent = new Intent(this.jka, MobileFriendUI.class);
    this.jka.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.s
 * JD-Core Version:    0.6.2
 */