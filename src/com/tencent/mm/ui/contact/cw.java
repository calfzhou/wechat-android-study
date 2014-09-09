package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ar.b;
import com.tencent.mm.k;
import com.tencent.mm.model.v;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.ui.c;
import java.util.List;

final class cw extends BaseAdapter
{
  public cw(GroupCardSelectUI paramGroupCardSelectUI)
  {
  }

  public final int getCount()
  {
    return GroupCardSelectUI.d(this.jAe).size();
  }

  public final Object getItem(int paramInt)
  {
    return GroupCardSelectUI.d(this.jAe).get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.storage.i locali = (com.tencent.mm.storage.i)GroupCardSelectUI.d(this.jAe).get(paramInt);
    cx localcx1;
    if (paramView == null)
    {
      localcx1 = new cx(this.jAe);
      paramView = View.inflate(this.jAe, k.bgB, null);
      localcx1.eRG = ((TextView)paramView.findViewById(com.tencent.mm.i.axa));
      localcx1.jAf = ((TextView)paramView.findViewById(com.tencent.mm.i.axb));
      localcx1.dtI = ((ImageView)paramView.findViewById(com.tencent.mm.i.awZ));
      paramView.setTag(localcx1);
    }
    for (cx localcx2 = localcx1; ; localcx2 = (cx)paramView.getTag())
    {
      c.a(localcx2.dtI, locali.getUsername());
      TextView localTextView = localcx2.jAf;
      localTextView.setText(b.e(this.jAe, y.dh(locali.getUsername()), (int)localcx2.jAf.getTextSize()));
      localcx2.eRG.setText("(" + v.cW(locali.getUsername()) + ")");
      return paramView;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cw
 * JD-Core Version:    0.6.2
 */