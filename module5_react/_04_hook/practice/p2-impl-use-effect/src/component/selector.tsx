import React from 'react';
import { useState, useEffect } from "react";

function Selector(props:any) {
    let [selected, setSelected] = useState("0");
    let [valueSelected, setValueSelected] = useState("");

    const choice = (e:any) => {
        setSelected(e.target.value);
        switch (selected) {
            case "0":
                setValueSelected("Java");
                break;
            case "1":
                setValueSelected("Angular");
                break;
            case "2":
                setValueSelected("Javascript");
                break;
            case "3":
                setValueSelected("Php");
                break;
            default:
        }
    };

    useEffect(() => {
        switch (selected) {
            case "0":
                setValueSelected("Java");
                break;
            case "1":
                setValueSelected("Angular");
                break;
            case "2":
                setValueSelected("Javascript");
                break;
            case "3":
                setValueSelected("Php");
                break;
            default:
        }
    }, [selected]);

    return (
        <div>
            Course :
            <select
                onChange={e => {
                    choice(e);
                }}
            >
                <option value="0">Java</option>
                <option value="1">Angular</option>
                <option value="2">Javascript</option>
                <option value="3">Php</option>
            </select>
            <h2>Your selected: {valueSelected}</h2>
        </div>
    );
}

export default Selector;
