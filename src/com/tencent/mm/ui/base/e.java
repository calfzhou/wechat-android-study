package com.tencent.mm.ui.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.ei;
import com.tencent.mm.ui.tools.eo;
import com.tencent.smtt.sdk.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JgClassChecked(author=20, fComment="checked", lastDate="201400504", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class e
{
  public static aa a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    if (paramInt2 != 0)
      localad.pn(paramInt2);
    localad.po(paramInt1);
    localad.d(paramInt3, paramOnClickListener1);
    localad.e(paramInt4, paramOnClickListener2);
    localad.b(new o(paramOnClickListener2));
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    return a(paramContext, paramInt1, paramInt2, true, paramOnClickListener);
  }

  public static aa a(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    return a(paramContext, paramContext.getString(paramInt1), paramContext.getString(paramInt2), paramOnClickListener1, paramOnClickListener2);
  }

  public static aa a(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    if (paramInt2 > 0)
      localad.pn(paramInt2);
    localad.po(paramInt1);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener);
    localad.eN(paramBoolean);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString, Drawable paramDrawable, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(null);
    localad.BL(null);
    localad.BM(paramString);
    localad.e(paramDrawable);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString, View paramView, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString);
    localad.ao(paramView);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString, View paramView, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString);
    localad.BL(null);
    localad.ao(paramView);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener1);
    localad.e(com.tencent.mm.n.bsK, paramOnClickListener2);
    localad.b(new p(paramOnClickListener2));
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    return a(paramContext, true, paramString1, paramView, paramString2, paramString3, paramOnClickListener1, paramOnClickListener2);
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener)
  {
    return a(paramContext, paramString1, paramString2, true, paramOnClickListener);
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener);
    localad.b(paramOnCancelListener);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener1);
    localad.e(com.tencent.mm.n.bsK, paramOnClickListener2);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, View paramView, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString1);
    localad.ao(paramView);
    localad.a(paramString2, paramOnClickListener);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener)
  {
    return a(paramContext, paramString1, paramString2, paramString3, true, paramOnClickListener);
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, String paramString3, x paramx)
  {
    aa localaa;
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      localaa = null;
      return localaa;
    }
    ad localad = new ad(paramContext);
    localad.eN(false);
    localad.aRA();
    localad.e(com.tencent.mm.n.bsK, null);
    localad.BK(paramString1);
    View localView = View.inflate(paramContext, com.tencent.mm.k.bil, null);
    EditText localEditText = (EditText)localView.findViewById(com.tencent.mm.i.aqy);
    if (!ch.jb(paramString2))
      localEditText.append(paramString2);
    TextView localTextView = (TextView)localView.findViewById(com.tencent.mm.i.aSX);
    if (ch.jb(paramString3))
      localTextView.setVisibility(8);
    while (true)
    {
      localad.c(com.tencent.mm.n.btQ, new q(paramx, localEditText));
      localad.ao(localView);
      localaa = localad.aRB();
      localaa.show();
      a(paramContext, localaa);
      if (!(paramContext instanceof MMActivity))
        break;
      localView.post(new r(paramContext));
      return localaa;
      localTextView.setText(paramString3);
    }
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener)
  {
    View localView = View.inflate(paramContext, com.tencent.mm.k.bqq, null);
    aa localaa = a(paramContext, paramString1, localView, paramString3, paramString4, paramOnClickListener, null);
    localaa.setOnDismissListener(new v(null));
    ((WebView)localView.findViewById(com.tencent.mm.i.dcq)).loadUrl(paramString2);
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.a(paramString3, paramOnClickListener1);
    localad.b(paramString4, paramOnClickListener2);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, String paramString3, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.a(paramString3, paramOnClickListener);
    localad.eN(paramBoolean);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener);
    localad.eN(paramBoolean);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.d(com.tencent.mm.n.btQ, paramOnClickListener1);
    localad.e(com.tencent.mm.n.bsK, paramOnClickListener2);
    localad.eN(paramBoolean);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, String paramString1, List paramList, int paramInt, String paramString2, w paramw)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    if (paramList.isEmpty())
    {
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpK6ZJSQRdrgGEFdUYhqDjxF", "show switch alert fail");
      return null;
    }
    ad localad = new ad(paramContext);
    localad.eN(false);
    localad.e(com.tencent.mm.n.bsK, null);
    localad.BK(paramString1);
    View localView = View.inflate(paramContext, com.tencent.mm.k.bim, null);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.aSX);
    if (ch.jb(paramString2))
      localTextView1.setVisibility(8);
    LinearLayout localLinearLayout;
    while (true)
    {
      localLinearLayout = (LinearLayout)localView.findViewById(com.tencent.mm.i.aSn);
      for (int i = -1 + paramList.size(); i >= 0; i--)
      {
        TextView localTextView2 = (TextView)View.inflate(paramContext, com.tencent.mm.k.bkQ, null);
        localTextView2.setText((CharSequence)paramList.get(i));
        if (i == paramInt)
          localTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.tencent.mm.h.ZL, 0);
        if (i == -1 + paramList.size())
        {
          int j = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.PH);
          localTextView2.setBackgroundResource(com.tencent.mm.h.abv);
          localTextView2.setPadding(j, j, j, j);
        }
        localTextView2.setTag(Integer.valueOf(i));
        localLinearLayout.addView(localTextView2, 1);
        localTextView2.setOnClickListener(new s(localLinearLayout, paramw));
      }
      localTextView1.setText(paramString2);
    }
    localad.ao(localView);
    aa localaa = localad.aRB();
    localLinearLayout.setTag(localaa);
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, boolean paramBoolean, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString1);
    localad.ao(paramView);
    localad.a(paramString2, paramOnClickListener1);
    localad.b(paramString3, paramOnClickListener2);
    localad.eN(paramBoolean);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static aa a(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.a(paramString3, paramOnClickListener1);
    localad.b(paramString4, paramOnClickListener2);
    localad.eN(paramBoolean);
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }

  public static au a(Context paramContext, String paramString, List paramList1, List paramList2, z paramz)
  {
    return b(paramContext, paramString, paramList1, paramList2, null, true, paramz);
  }

  public static au a(Context paramContext, String paramString1, List paramList1, List paramList2, String paramString2, z paramz)
  {
    return b(paramContext, paramString1, paramList1, paramList2, paramString2, true, paramz);
  }

  public static au a(Context paramContext, String paramString1, List paramList1, List paramList2, String paramString2, boolean paramBoolean, z paramz)
  {
    return b(paramContext, paramString1, paramList1, paramList2, paramString2, paramBoolean, paramz);
  }

  public static au a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, y paramy)
  {
    return a(paramContext, paramString1, paramArrayOfString, paramString2, true, paramy, null);
  }

  public static au a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, y paramy, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramContext, paramString1, paramArrayOfString, paramString2, true, paramy, paramOnCancelListener);
  }

  public static au a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, boolean paramBoolean, y paramy)
  {
    return a(paramContext, paramString1, paramArrayOfString, paramString2, paramBoolean, paramy, null);
  }

  @Deprecated
  private static au a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, boolean paramBoolean, y paramy, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    if (((paramArrayOfString == null) || (paramArrayOfString.length == 0)) && (ch.jb(paramString2)))
      return null;
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      Collections.addAll(localArrayList, paramArrayOfString);
    if (!ch.jb(paramString2))
      localArrayList.add(paramString2);
    if (paramBoolean)
    {
      ei localei = new ei(paramContext);
      localei.a(new k(paramString1, localArrayList));
      localei.b(new l(paramy));
      localei.c(paramOnCancelListener);
      au localau = localei.baG();
      a(paramContext, localau);
      return localau;
    }
    eo localeo = new eo(paramContext);
    localeo.a(new m(paramString1, localArrayList));
    localeo.b(new n(paramy));
    localeo.c(paramOnCancelListener);
    localeo.ck();
    return null;
  }

  private static cr a(Context paramContext, int paramInt, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    fk.a(true, null);
    cr localcr = cr.b(paramContext, paramString, paramBoolean, paramInt, new u(paramOnCancelListener));
    a(paramContext, localcr);
    return localcr;
  }

  public static cr a(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramContext, 2, paramString, true, paramOnCancelListener);
  }

  public static cr a(Context paramContext, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramContext, 0, paramString, paramBoolean, paramOnCancelListener);
  }

  public static void a(Context paramContext, Dialog paramDialog)
  {
    if ((paramContext instanceof MMActivity))
      ((MMActivity)paramContext).a(paramDialog);
  }

  public static Toast av(Context paramContext, String paramString)
  {
    return aw(paramContext, paramString);
  }

  public static Toast aw(Context paramContext, String paramString)
  {
    Toast localToast = Toast.makeText(paramContext, paramString, 0);
    localToast.show();
    return localToast;
  }

  public static aa b(Context paramContext, int paramInt1, int paramInt2)
  {
    return o(paramContext, paramContext.getString(paramInt1), paramContext.getString(paramInt2));
  }

  public static aa b(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    return a(paramContext, paramContext.getString(paramInt1), paramContext.getString(paramInt2), false, paramOnClickListener1, paramOnClickListener2);
  }

  @Deprecated
  private static au b(Context paramContext, String paramString1, List paramList1, List paramList2, String paramString2, boolean paramBoolean, z paramz)
  {
    if (((paramList1 == null) || (paramList1.size() == 0)) && (ch.jb(paramString2)))
      return null;
    if (paramList1 == null)
      paramList1 = new ArrayList();
    if (paramBoolean)
    {
      ei localei = new ei(paramContext);
      localei.a(new g(paramString1, paramList1, paramList2, paramString2));
      localei.b(new h(paramz));
      localei.c(null);
      au localau = localei.baG();
      a(paramContext, localau);
      return localau;
    }
    eo localeo = new eo(paramContext);
    localeo.a(new i(paramString1, paramList1, paramList2, paramString2));
    localeo.b(new j(paramz));
    localeo.c(null);
    localeo.ck();
    return null;
  }

  public static au b(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, y paramy)
  {
    return a(paramContext, paramString1, paramArrayOfString, paramString2, true, paramy, null);
  }

  public static aa o(Context paramContext, String paramString1, String paramString2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      return null;
    ad localad = new ad(paramContext);
    localad.BK(paramString2);
    localad.BL(paramString1);
    localad.eN(true);
    localad.d(com.tencent.mm.n.btQ, new f());
    aa localaa = localad.aRB();
    localaa.show();
    a(paramContext, localaa);
    return localaa;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.e
 * JD-Core Version:    0.6.2
 */