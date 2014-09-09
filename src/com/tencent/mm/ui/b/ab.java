package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.model.bt;
import com.tencent.mm.model.x;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import java.lang.ref.WeakReference;

final class ab
  implements View.OnClickListener
{
  ab(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    Context localContext = (Context)s.h(this.iWO).get();
    int i;
    if ((0x10000 & x.pO()) == 0)
    {
      i = 1;
      if (i == 0)
        break label103;
      a.l(localContext, "masssend", ".ui.MassSendHistoryUI");
    }
    while (true)
    {
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(11);
      arrayOfObject[1] = Integer.valueOf(1);
      localn.d(11002, arrayOfObject);
      return;
      i = 0;
      break;
      label103: localContext.startActivity(new Intent(localContext, ContactInfoUI.class).putExtra("Contact_User", "masssendapp"));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.ab
 * JD-Core Version:    0.6.2
 */