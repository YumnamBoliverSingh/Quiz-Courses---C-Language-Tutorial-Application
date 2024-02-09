package com.example.cprogrammingtutorial_easyconceptnoads;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Second_tab extends Fragment {
    SearchView searchView;
    ListView listView;
    ArrayList list;
    ArrayAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_second_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


        searchView = view.findViewById(R.id.searchView);
        listView = view.findViewById(R.id.listView);
        list = new ArrayList<>();



        list.add(getString(R.string.string_pTops1).toString());
        list.add(getString(R.string.string_pTops2).toString());
        list.add(getString(R.string.string_pTops3).toString());
        list.add(getString(R.string.string_pTops4).toString());
        list.add(getString(R.string.string_pTops5).toString());
        list.add(getString(R.string.string_pTops6).toString());
        list.add(getString(R.string.string_pTops7).toString());
        list.add(getString(R.string.string_pTops8).toString());
        list.add(getString(R.string.string_pTops9).toString());
        list.add(getString(R.string.string_pTops10).toString());

        list.add(getString(R.string.string_pTops11).toString());
        list.add(getString(R.string.string_pTops12).toString());
        list.add(getString(R.string.string_pTops13).toString());
        list.add(getString(R.string.string_pTops14).toString());
        list.add(getString(R.string.string_pTops15).toString());
        list.add(getString(R.string.string_pTops16).toString());
        list.add(getString(R.string.string_pTops17).toString());
        list.add(getString(R.string.string_pTops18).toString());
        list.add(getString(R.string.string_pTops19).toString());
        list.add(getString(R.string.string_pTops20).toString());

        list.add(getString(R.string.string_pTops21).toString());
        list.add(getString(R.string.string_pTops22).toString());
        list.add(getString(R.string.string_pTops23).toString());
        list.add(getString(R.string.string_pTops24).toString());
        list.add(getString(R.string.string_pTops25).toString());
        list.add(getString(R.string.string_pTops26).toString());
        list.add(getString(R.string.string_pTops27).toString());
        list.add(getString(R.string.string_pTops28).toString());
        list.add(getString(R.string.string_pTops29).toString());
        list.add(getString(R.string.string_pTops30).toString());

        list.add(getString(R.string.string_pTops31).toString());
        list.add(getString(R.string.string_pTops32).toString());
        list.add(getString(R.string.string_pTops33).toString());
        list.add(getString(R.string.string_pTops34).toString());
        list.add(getString(R.string.string_pTops35).toString());
        list.add(getString(R.string.string_pTops36).toString());
        list.add(getString(R.string.string_pTops37).toString());
        list.add(getString(R.string.string_pTops38).toString());
        list.add(getString(R.string.string_pTops39).toString());
        list.add(getString(R.string.string_pTops40).toString());

        list.add(getString(R.string.string_pTops41).toString());
        list.add(getString(R.string.string_pTops42).toString());
        list.add(getString(R.string.string_pTops43).toString());
        list.add(getString(R.string.string_pTops44).toString());
        list.add(getString(R.string.string_pTops45).toString());
        list.add(getString(R.string.string_pTops46).toString());
        list.add(getString(R.string.string_pTops47).toString());
        list.add(getString(R.string.string_pTops48).toString());
        list.add(getString(R.string.string_pTops49).toString());
        list.add(getString(R.string.string_pTops50).toString());

        list.add(getString(R.string.string_pTops51).toString());
        list.add(getString(R.string.string_pTops52).toString());
        list.add(getString(R.string.string_pTops53).toString());
        list.add(getString(R.string.string_pTops54).toString());
        list.add(getString(R.string.string_pTops55).toString());
        list.add(getString(R.string.string_pTops56).toString());
        list.add(getString(R.string.string_pTops57).toString());
        list.add(getString(R.string.string_pTops58).toString());
        list.add(getString(R.string.string_pTops59).toString());
        list.add(getString(R.string.string_pTops60).toString());

        list.add(getString(R.string.string_pTops61).toString());
        list.add(getString(R.string.string_pTops62).toString());
        list.add(getString(R.string.string_pTops63).toString());
        list.add(getString(R.string.string_pTops64).toString());
        list.add(getString(R.string.string_pTops65).toString());
        list.add(getString(R.string.string_pTops66).toString());
        list.add(getString(R.string.string_pTops67).toString());
        list.add(getString(R.string.string_pTops68).toString());
        list.add(getString(R.string.string_pTops69).toString());
        list.add(getString(R.string.string_pTops70).toString());

        list.add(getString(R.string.string_pTops71).toString());
        list.add(getString(R.string.string_pTops72).toString());
        list.add(getString(R.string.string_pTops73).toString());
        list.add(getString(R.string.string_pTops74).toString());
        list.add(getString(R.string.string_pTops75).toString());
        list.add(getString(R.string.string_pTops76).toString());
        list.add(getString(R.string.string_pTops77).toString());
        list.add(getString(R.string.string_pTops78).toString());
        list.add(getString(R.string.string_pTops79).toString());
        list.add(getString(R.string.string_pTops80).toString());

        list.add(getString(R.string.string_pTops81).toString());
        list.add(getString(R.string.string_pTops82).toString());
        list.add(getString(R.string.string_pTops83).toString());
        list.add(getString(R.string.string_pTops84).toString());
        list.add(getString(R.string.string_pTops85).toString());
        list.add(getString(R.string.string_pTops86).toString());
        list.add(getString(R.string.string_pTops87).toString());
        list.add(getString(R.string.string_pTops88).toString());
        list.add(getString(R.string.string_pTops89).toString());
        list.add(getString(R.string.string_pTops90).toString());

        list.add(getString(R.string.string_pTops91).toString());
        list.add(getString(R.string.string_pTops92).toString());
        list.add(getString(R.string.string_pTops93).toString());
        list.add(getString(R.string.string_pTops94).toString());
        list.add(getString(R.string.string_pTops95).toString());
        list.add(getString(R.string.string_pTops96).toString());
        list.add(getString(R.string.string_pTops97).toString());
        list.add(getString(R.string.string_pTops98).toString());
        list.add(getString(R.string.string_pTops99).toString());
        list.add(getString(R.string.string_pTops100).toString());

        list.add(getString(R.string.string_pTops101).toString());
        list.add(getString(R.string.string_pTops102).toString());
        list.add(getString(R.string.string_pTops103).toString());

        list.add(getString(R.string.string_pTops110).toString());
        list.add(getString(R.string.string_pTops111).toString());
        list.add(getString(R.string.string_pTops112).toString());
        list.add(getString(R.string.string_pTops113).toString());
        list.add(getString(R.string.string_pTops114).toString());
        list.add(getString(R.string.string_pTops115).toString());
        list.add(getString(R.string.string_pTops116).toString());
        list.add(getString(R.string.string_pTops117).toString());
        list.add(getString(R.string.string_pTops118).toString());
        list.add(getString(R.string.string_pTops119).toString());
        list.add(getString(R.string.string_pTops120).toString());

        list.add(getString(R.string.string_pTops120).toString());
        list.add(getString(R.string.string_pTops121).toString());
        list.add(getString(R.string.string_pTops122).toString());
        list.add(getString(R.string.string_pTops123).toString());
        list.add(getString(R.string.string_pTops124).toString());
        list.add(getString(R.string.string_pTops125).toString());
        list.add(getString(R.string.string_pTops126).toString());
        list.add(getString(R.string.string_pTops127).toString());
        list.add(getString(R.string.string_pTops128).toString());
        list.add(getString(R.string.string_pTops129).toString());
        list.add(getString(R.string.string_pTops130).toString());

        list.add(getString(R.string.string_pTops131).toString());
        list.add(getString(R.string.string_pTops132).toString());
        list.add(getString(R.string.string_pTops133).toString());
        list.add(getString(R.string.string_pTops134).toString());
        list.add(getString(R.string.string_pTops135).toString());
        list.add(getString(R.string.string_pTops136).toString());
        list.add(getString(R.string.string_pTops137).toString());
        list.add(getString(R.string.string_pTops138).toString());
        list.add(getString(R.string.string_pTops139).toString());
        list.add(getString(R.string.string_pTops140).toString());
        list.add(getString(R.string.string_pTops141).toString());
        list.add(getString(R.string.string_pTops142).toString());
        list.add(getString(R.string.string_pTops143).toString());



        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(getActivity(), "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                int integer_value = position + 1;
                Intent intent = new Intent(getActivity(), ProgramNOutput.class);
                Toast.makeText(getActivity(),"Position: "+integer_value, Toast.LENGTH_LONG).show();

                if(integer_value > 104){
                    integer_value=integer_value+5;
                }
//                String val = Integer.toString(integer_value);
//              Toast.makeText(getActivity(), val,Toast.LENGTH_SHORT).show();
                intent.putExtra("intent_program_no", integer_value);
                startActivity(intent);
            }
        });

    }

}


