package com.ebenezer.gana.ebenportfolio.views;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.ebenezer.gana.ebenportfolio.R;

public class ContactFragment extends Fragment implements View.OnClickListener {

    private CardView cvFacebook, cvGmail, cvLinkedIn, cvGithub;


    public ContactFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View contactFragment = inflater.inflate(R.layout.fragment_contact, container, false);
        cvFacebook = contactFragment.findViewById(R.id.cvFacebook);
        cvGmail = contactFragment.findViewById(R.id.cvGmail);
        cvLinkedIn = contactFragment.findViewById(R.id.cvLinkedIn);
        cvGithub = contactFragment.findViewById(R.id.cvGithub);

        cvFacebook.setOnClickListener(this);
        cvGmail.setOnClickListener(this);
        cvLinkedIn.setOnClickListener(this);
        cvGithub.setOnClickListener(this);

        return contactFragment;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cvFacebook:
                Uri facebookId = Uri.parse(getString(R.string.fbId));
                Intent intent = new Intent(Intent.ACTION_VIEW, facebookId);
                startActivity(intent);
                break;

            case R.id.cvGmail:
                Intent gmailIntent = new Intent(Intent.ACTION_SENDTO);
                gmailIntent.setData(Uri.parse("mailto:"));
                gmailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ebenezergana@gmail.com"});
                startActivity(gmailIntent);
                break;

            case R.id.cvLinkedIn:
                Uri linkedInId = Uri.parse(getString(R.string.linkedin_id));
                Intent linkedInIntent = new Intent(Intent.ACTION_VIEW, linkedInId);
                startActivity(linkedInIntent);
                break;

            case R.id.cvGithub:
                Uri githubId = Uri.parse(getString(R.string.githubId));
                Intent gitIntent = new Intent(Intent.ACTION_VIEW, githubId);
                startActivity(gitIntent);
                break;

            default:
                break;
        }
    }
}
