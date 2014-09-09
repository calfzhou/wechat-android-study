package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.modelfriend.o;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class al
  implements AdapterView.OnItemClickListener
{
  al(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    o localo = (o)FacebookFriendUI.b(this.iOo).getItem(paramInt - FacebookFriendUI.e(this.iOo).getHeaderViewsCount());
    if ((localo.getStatus() == 100) || (localo.getStatus() == 101))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", localo.getUsername());
      localIntent.putExtra("Contact_Nick", localo.vz());
      localIntent.putExtra("Contact_KFacebookId", localo.vR());
      localIntent.putExtra("Contact_KFacebookName", localo.vS());
      localIntent.putExtra("Contact_Scene", 31);
      a.dWo.c(localIntent, this.iOo);
    }
    if (localo.getStatus() == 102);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.al
 * JD-Core Version:    0.6.2
 */