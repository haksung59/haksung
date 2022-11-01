//
//  ContentView.swift
//  PracticeSwiftUIMemo
//
//  Created by haksung on 2022/11/01.
//

import SwiftUI
import CoreData

struct MemoListScene: View {
    var body: some View {
        Text("Hello, World!")
    }
}

struct MemoListScene_Previews: PreviewProvider {
    static var previews: some View {
        MemoListScene().environment(\.managedObjectContext, PersistenceController.preview.container.viewContext)
    }
}
