package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.i;

final class ac
  implements AdapterView.OnItemClickListener
{
  ac(AtSomeoneUI paramAtSomeoneUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    i locali = (i)AtSomeoneUI.a(this.jmC).getItem(paramInt);
    Intent localIntent = new Intent();
    String str1 = AtSomeoneUI.a(AtSomeoneUI.b(this.jmC), locali.getUsername());
    if (ap.jb(str1));
    for (String str2 = locali.oc(); ; str2 = str1)
    {
      localIntent.putExtra("Select_Conv_User", str2);
      this.jmC.setResult(-1, localIntent);
      this.jmC.finish();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ac
 * JD-Core Version:    0.6.2
 */