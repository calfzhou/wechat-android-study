package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.voicereminder.a.a;
import com.tencent.mm.plugin.voicereminder.a.l;
import com.tencent.mm.protocal.a.aeu;
import com.tencent.mm.ui.base.e;
import java.util.LinkedList;

final class et
  implements DialogInterface.OnClickListener
{
  et(es parames)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qX().a(331, eo.a(this.jpM.jpJ, new eu(this)));
    LinkedList localLinkedList = new LinkedList();
    aeu localaeu = new aeu();
    localaeu.hPw = this.jpM.jpL.gSL;
    localLinkedList.add(localaeu);
    a locala = new a(localLinkedList, localLinkedList.size());
    bg.qX().d(locala);
    eo localeo = this.jpM.jpJ;
    Activity localActivity = eo.a(this.jpM.jpJ).agh();
    eo.a(this.jpM.jpJ).getString(n.buo);
    eo.a(localeo, e.a(localActivity, eo.a(this.jpM.jpJ).getString(n.bzs), true, new ev(this, locala)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.et
 * JD-Core Version:    0.6.2
 */