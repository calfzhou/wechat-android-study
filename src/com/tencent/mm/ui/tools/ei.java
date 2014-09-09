package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.au;
import com.tencent.mm.ui.base.bv;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.ch;
import com.tencent.mm.ui.base.cj;
import com.tencent.mm.ui.base.ck;
import com.tencent.mm.ui.base.cl;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Iterator;
import java.util.List;

public final class ei
  implements AdapterView.OnItemClickListener
{
  private LayoutInflater gJ;
  private bv jTK;
  private cl jTL;
  private cm jTM;
  private cg jTN;
  private em jTO;
  private cj jTP;
  private ck jTQ;
  private Context mContext;

  public ei(Context paramContext)
  {
    this.mContext = paramContext;
    this.gJ = LayoutInflater.from(paramContext);
    this.jTK = new bv(paramContext);
    this.jTN = new cg();
  }

  public final void a(View paramView, int paramInt, long paramLong, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, cm paramcm)
  {
    this.jTN.clear();
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(paramView, paramInt, paramLong);
    paramOnCreateContextMenuListener.onCreateContextMenu(this.jTN, paramView, localAdapterContextMenuInfo);
    Iterator localIterator = this.jTN.aSj().iterator();
    while (localIterator.hasNext())
      ((ch)localIterator.next()).a(localAdapterContextMenuInfo);
    baG();
    this.jTM = paramcm;
  }

  public final void a(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, cm paramcm)
  {
    this.jTM = paramcm;
    z.v("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "registerForContextMenu");
    if ((paramView instanceof AbsListView))
    {
      z.v("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "registerForContextMenu AbsListView");
      ((AbsListView)paramView).setOnItemLongClickListener(new ej(this, paramOnCreateContextMenuListener));
      return;
    }
    if ((paramView instanceof MMWebView))
    {
      z.v("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "registerForContextMenu for webview");
      paramView.setOnLongClickListener(new ek(this, paramOnCreateContextMenuListener));
      return;
    }
    z.v("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "registerForContextMenu normal view");
    paramView.setOnLongClickListener(new el(this, paramOnCreateContextMenuListener));
  }

  public final void a(cj paramcj)
  {
    this.jTP = paramcj;
  }

  public final void a(ck paramck)
  {
    this.jTQ = paramck;
  }

  public final void a(cl paramcl)
  {
    this.jTL = paramcl;
  }

  public final void b(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, cm paramcm)
  {
    this.jTN.clear();
    paramOnCreateContextMenuListener.onCreateContextMenu(this.jTN, paramView, null);
    baG();
    this.jTM = paramcm;
  }

  public final void b(cm paramcm)
  {
    this.jTM = paramcm;
  }

  public final au baG()
  {
    if (this.jTL != null)
    {
      this.jTN.clear();
      this.jTN = new cg();
      this.jTL.a(this.jTN);
    }
    if (this.jTN.aSl())
    {
      z.w("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "show, menu empty");
      return null;
    }
    if (this.jTO == null)
      this.jTO = new em(this, (byte)0);
    this.jTK.a(this.jTO);
    this.jTK.setOnItemClickListener(this);
    this.jTK.setTitle(this.jTN.aSk());
    this.jTK.show();
    return this.jTK;
  }

  public final void c(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.jTK.setOnCancelListener(paramOnCancelListener);
  }

  public final void dismiss()
  {
    if (this.jTK.isShowing())
      this.jTK.dismiss();
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ch localch = (ch)this.jTN.aSj().get(paramInt);
    if (localch.performClick())
    {
      z.i("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "onItemClick menu item has listener");
      dismiss();
      return;
    }
    if (this.jTM != null)
      this.jTM.d(localch, paramInt);
    dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ei
 * JD-Core Version:    0.6.2
 */